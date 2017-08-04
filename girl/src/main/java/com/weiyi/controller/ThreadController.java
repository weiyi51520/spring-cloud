package com.weiyi.controller;

import com.weiyi.Thread.ThreadGIrl;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by weiyi on 2017/8/4/004.
 */
@RestController
public class ThreadController {
    ExecutorService executor = Executors.newFixedThreadPool(4);
    int num = 0;
    @RequestMapping("thread")
    public int mobileToShop(){
        try {
                num++;
                ThreadGIrl threadGIrl = new ThreadGIrl(num);
                System.out.println(num+""+num+num+num);
                synchronized (threadGIrl){
                    threadGIrl.wait(5000);
                }
                executor.submit(threadGIrl);
                if (num>1000){
                    executor.shutdown();
                }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num;
    }
}
