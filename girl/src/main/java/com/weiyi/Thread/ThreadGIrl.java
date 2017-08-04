package com.weiyi.Thread;

/**
 * Created by weiyi on 2017/8/4/004.
 */
public class ThreadGIrl implements Runnable{
    private int num;

    public ThreadGIrl(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("num:"+num);
    }
}
