package com.miracle.pattern.client;

import com.miracle.pattern.factory.method.AliPayFactory;
import com.miracle.pattern.factory.method.Pay;
import com.miracle.pattern.factory.method.PayFactory;
import com.miracle.pattern.factory.method.WechatPayFactory;

public class FactoryMethodClient {
    public static void run() {
        PayFactory aliFactory = new AliPayFactory();
        Pay aliPay = aliFactory.createPay();
        aliPay.unifiedorder();

        PayFactory wechatFactory = new WechatPayFactory();
        Pay wechatPay = wechatFactory.createPay();
        wechatPay.unifiedorder();
    }
}
