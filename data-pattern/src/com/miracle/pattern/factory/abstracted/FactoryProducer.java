package com.miracle.pattern.factory.abstracted;

import com.miracle.pattern.factory.abstracted.ali.AliOrderFactory;
import com.miracle.pattern.factory.abstracted.wechat.WechatOrderFactory;

public class FactoryProducer {
    public static OrderFactory createFactory(FactoryType type) {
        switch (type) {
            case ALI:
                return new AliOrderFactory();
            case WECHAT:
                return new WechatOrderFactory();
            default:
                return null;
        }
    }
}
