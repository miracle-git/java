package com.miracle.pattern.client;

import com.miracle.pattern.factory.simple.Pay;
import com.miracle.pattern.factory.simple.PayFactory;
import com.miracle.pattern.factory.simple.PayType;

public class SimpleFactoryClient {
    public static void run() {
        Pay aliPay = PayFactory.createPay(PayType.ALI_PAY);
        aliPay.unifiedorder();

        Pay wechatPay = PayFactory.createPay(PayType.WECHAT_PAY);
        wechatPay.unifiedorder();
    }
}
