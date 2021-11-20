package com.miracle.pattern.facade;

public class WechatMessageManager implements MessageManager {
    @Override
    public void send() {
        System.out.println("推送微信消息");
    }
}
