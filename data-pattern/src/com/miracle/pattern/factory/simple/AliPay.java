package com.miracle.pattern.factory.simple;

public class AliPay implements Pay {
    @Override
    public void unifiedorder() {
        System.out.println("支付宝支付 统一下单实现");
    }
}
