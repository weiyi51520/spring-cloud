package com.weiyi.service;

import com.weiyi.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by weiyi on 2017/8/4/004.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;

    @Test
    public void findOne() throws Exception {
        Girl girl = girlService.findOne(6);
        Assert.assertEquals(new Integer(13),girl.getAge());
    }

}