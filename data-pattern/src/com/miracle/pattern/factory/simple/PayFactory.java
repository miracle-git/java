package com.miracle.pattern.factory.simple;

public class PayFactory {
    public static Pay createPay(PayType type) {
        switch (type) {
            case ALI_PAY:
                return new AliPay();
            case WECHAT_PAY:
                return new WechatPay();
            default:
                return null;
        }
    }
}
