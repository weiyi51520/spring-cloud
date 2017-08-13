package org.seckill.dao.cache;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import org.seckill.entity.Seckill;
import org.seckill.util.SerializeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by weiyi on 2017/7/13 0013.
 */
public class RedisDao {
    private final JedisPool jedisPool;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private RuntimeSchema<Seckill> schema = RuntimeSchema.createFrom(Seckill.class);

    public RedisDao(String ip,int port) {
        this.jedisPool = new JedisPool(ip,port);
    }

    public byte[] simpleGet(String key){
        Jedis jedis = jedisPool.getResource();
        return jedis.get(key.getBytes());
    }

    public void simpleSet(String key,byte[] bytes){
        Jedis jedis = jedisPool.getResource();
        int timeout = 60*60;//1小时
        String str = bytes.toString();
        String result = jedis.setex(key,timeout,str);
    }


    public Seckill getSeckill(long seckillId){
        //redis 操作逻辑
        try {
            Jedis jedis = jedisPool.getResource();
            try {
                String key = "seckill:"+seckillId;
                //并没有实现内部序列化
                //get->byte[]->反序列化->Object(Seckill)
                //采用自定义序列化优化性能protostuff:pojo
                byte[] bytes = jedis.get(key).getBytes();
                if (bytes !=null){
                    //Seckill seckill = (Seckill) SerializeUtil.unserialize(bytes);
                    Seckill seckill = schema.newMessage();
                    ProtostuffIOUtil.mergeFrom(bytes,seckill,schema);
                    //seckill 被反序列化
                    return seckill;
                }
            } finally {
                jedis.close();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        return  null;
    }

    public String putSeckill(Seckill seckill){
        //set Objec(Seckill) -> 序列化->byte[]
        try {
            Jedis jedis = jedisPool.getResource();
            try {
                String key = "seckill:"+seckill.getSeckillId();
                //byte[] bytes = SerializeUtil.serialize(seckill);
                byte[] bytes =ProtostuffIOUtil.toByteArray(seckill,schema,LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));//使用缓存器默认大小进行反序列化
                int timeout = 60*60;//1小时
                String result = jedis.setex(key.getBytes(),timeout,bytes);
                return result;
            } finally {
                jedis.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
