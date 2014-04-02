/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.regrecall.producerconsumer;

/**
 * @author xingchi.wxc
 * @version $Id: ProducerConsumerMain, v 0.1 14-4-2 ÏÂÎç3:02 xingchi.wxc Exp $$
 */
public class ProducerConsumerMain {

    public static void main(String[] args) {
//        WaitNotifyChannel channel = new WaitNotifyChannel();
        BlockingQueueChannel channel = new BlockingQueueChannel();

        Thread producerThread = new Thread(new ProducerRunnable(channel));
        Thread consumerThread = new Thread(new ComsumerRunnable(channel));
        producerThread.start();
        consumerThread.start();
    }
}
