package com.miracle.pattern.facade;

public class MailMessageManager implements MessageManager {
    @Override
    public void send() {
        System.out.println("推送邮件消息");
    }
}
