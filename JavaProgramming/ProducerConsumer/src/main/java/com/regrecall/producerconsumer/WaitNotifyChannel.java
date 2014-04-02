/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.regrecall.producerconsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xingchi.wxc
 * @version $Id: WaitNotifyChannel, v 0.1 14-4-2 ÏÂÎç3:51 xingchi.wxc Exp $$
 */
public class WaitNotifyChannel implements Channel {

    private final List<String> list = new ArrayList<String>(10);

    @Override
    public synchronized void send(String str) {
        if (list.size() == 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(str);
        notify();
    }

    @Override
    public synchronized String receive() {
        if (list.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            notify();
        }
        return list.remove(0);
    }
}
