package com.miracle.pattern.facade;

public class MessageFacade implements MessageManager {
    private MessageManager wechat = new WechatMessageManager();
    private MessageManager sms = new SmsMessageManager();
    private MessageManager mail = new MailMessageManager();

    @Override
    public void send() {
        wechat.send();
        sms.send();
        mail.send();
    }
}
