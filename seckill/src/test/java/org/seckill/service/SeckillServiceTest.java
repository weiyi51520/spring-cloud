package org.seckill.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by weiyi on 2017/7/7 0007.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"})
public class SeckillServiceTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SeckillService seckillService;

    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("list={}",list);
    }

    @Test
    public void getById() throws Exception {
        Seckill seckill = seckillService.getById(1000L);
        logger.info("seckill={}",seckill);
    }

    //测试代码完整逻辑,注意可重复执行.
    @Test
    public void testSeckillLogic() throws Exception {
        long id = 1001L;
        long userPhone = 17714356705L;
        Exposer exposer = seckillService.exprtSeckillUrl(id);
        if(exposer.isExposed()){
            logger.info("exposer={}",exposer);
            String md5 = exposer.getMd5();
            SeckillExecution seckillExecution = null;
            try {
                seckillExecution = seckillService.executeSeckill(id,userPhone,md5);
                logger.info("result={}",seckillExecution);
            } catch (RepeatKillException e) {
                logger.error(e.getMessage());
            } catch (SeckillCloseException e) {
                logger.error(e.getMessage());
            } catch (SeckillException e) {
                logger.error(e.getMessage());
            }
        }else {
            //秒杀未开启
            logger.warn("exposer={}",exposer);
        }

        /*exposed=true,
        md5='67166581b324b073d8d642103d61a0a4',
         seckillId=1000, now=0, start=0, end=0*/
    }

    @Test
    public void executeSeckillProcedure(){
        long seckillId = 1001;
        long phone = 17714356705l;
        Exposer exposer = seckillService.exprtSeckillUrl(seckillId);
        if (exposer.isExposed()){
            String md5 = exposer.getMd5();
            SeckillExecution execution = seckillService.executeSeckillProceduce(seckillId,phone,md5);
            logger.info(execution.getStateInfo());
        }
    }
}