/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.regrecall.producerconsumer;

/**
 * @author xingchi.wxc
 * @version $Id: Channel, v 0.1 14-4-2 обнГ3:36 xingchi.wxc Exp $$
 */
public interface Channel {
    public void send(String str);

    public String receive();
}
