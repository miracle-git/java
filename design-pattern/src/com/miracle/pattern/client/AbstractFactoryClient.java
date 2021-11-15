package com.miracle.pattern.client;

import com.miracle.pattern.factory.abstracted.FactoryProducer;
import com.miracle.pattern.factory.abstracted.FactoryType;
import com.miracle.pattern.factory.abstracted.OrderFactory;

public class AbstractFactoryClient {
    public static void run() {
        OrderFactory factory = FactoryProducer.createFactory(FactoryType.ALI);
        factory.createPay().unifiedorder();
        factory.createRefund().refund();
    }
}
