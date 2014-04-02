/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.regrecall.producerconsumer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xingchi.wxc
 * @version $Id: ProducerRunnable, v 0.1 14-4-2 ÏÂÎç3:23 xingchi.wxc Exp $$
 */
public class ProducerRunnable implements Runnable {
    private final AtomicInteger integer = new AtomicInteger(0);
    private final Channel channel;

    public ProducerRunnable(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        for (;;) {
            String str = integer.toString();
            if (integer.getAndIncrement() == 15) {
                break;
            }
            System.out.println("Producer --- " + str);
            channel.send(str);
        }
    }
}
