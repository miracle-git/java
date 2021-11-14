package com.miracle.pattern.factory.method;

public class AliPayFactory implements PayFactory {
    @Override
    public Pay createPay() {
        return new AliPay();
    }
}
