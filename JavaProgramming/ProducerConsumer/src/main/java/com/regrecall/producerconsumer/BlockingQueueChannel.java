/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.regrecall.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author xingchi.wxc
 * @version $Id: BlockingQueueChannel, v 0.1 14-4-2 ÏÂÎç4:20 xingchi.wxc Exp $$
 */
public class BlockingQueueChannel implements Channel {

    private final ArrayBlockingQueue<String> blockQueue = new ArrayBlockingQueue<String>(10);


    @Override
    public void send(String str) {
        try {
            blockQueue.put(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String receive() {
        String ret = null;
        try {
            ret = blockQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
