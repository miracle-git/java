package com.miracle.pattern.factory.simple;

public class WechatPay implements Pay {
    @Override
    public void unifiedorder() {
        System.out.println("微信支付 统一下单实现");
    }
}
