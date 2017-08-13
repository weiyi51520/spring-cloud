package org.seckill.dao.cache;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dao.SeckillDao;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by weiyi on 2017/7/13 0013.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class RedisDaoTest {
    long id = 1000L;
    @Autowired
    private RedisDao redisDao;

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void getSeckill() throws Exception {
        Seckill seckill = redisDao.getSeckill(id);
        if(seckill==null){
            seckill = seckillDao.queryById(id);
            if(seckill!=null){
                String result = redisDao.putSeckill(seckill);
                System.out.println(result);
                seckill =  redisDao.getSeckill(id);
                System.out.println(seckill);
            }
        }
    }

    @Test
    public void putSeckill() throws Exception {
    }

}