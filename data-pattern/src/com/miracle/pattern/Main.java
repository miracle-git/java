package com.miracle.pattern;

//import com.miracle.pattern.singleton.*;
//import com.miracle.pattern.factory.simple.*;
//import com.miracle.pattern.factory.method.*;
import com.miracle.pattern.factory.abstracted.*;

public class Main {
    public static void main(String[] args) {
        // 单例模式
//        SingletonLazy.getInstance().process();
//        SingletonEager.getInstance().process();
        // 工厂模式 - 简单工厂
//        Pay aliPay = PayFactory.createPay(PayType.ALI_PAY);
//        aliPay.unifiedorder();

//        Pay wechatPay = PayFactory.createPay(PayType.WECHAT_PAY);
//        wechatPay.unifiedorder();

        // 工厂模式 - 工厂方法
//        PayFactory aliFactory = new AliPayFactory();
//        Pay aliPay = aliFactory.createPay();
//        aliPay.unifiedorder();
//
//        PayFactory wechatFactory = new WechatPayFactory();
//        Pay wechatPay = wechatFactory.createPay();
//        wechatPay.unifiedorder();

        // 工厂模式 - 抽象工厂
        OrderFactory factory = FactoryProducer.createFactory(FactoryType.ALI);
        factory.createPay().unifiedorder();
        factory.createRefund().refund();
    }
}
