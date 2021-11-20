package com.miracle.pattern.facade;

public class SmsMessageManager implements MessageManager {
    @Override
    public void send() {
        System.out.println("推送短信消息");
    }
}
