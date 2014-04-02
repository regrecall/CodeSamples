/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.regrecall.producerconsumer;

/**
 * @author xingchi.wxc
 * @version $Id: ComsumerRunnable, v 0.1 14-4-2 ÏÂÎç3:34 xingchi.wxc Exp $$
 */
public class ComsumerRunnable implements Runnable {
    private final Channel channel;

    public ComsumerRunnable(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        //  for test
//        try {
//            Thread.sleep(1000 * 10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (;;) {
            System.out.println("Comsumer --- " + channel.receive());
        }
    }
}
