package com.miracle.pattern.factory.abstracted.ali;

import com.miracle.pattern.factory.abstracted.OrderFactory;
import com.miracle.pattern.factory.abstracted.Pay;
import com.miracle.pattern.factory.abstracted.Refund;

public class AliOrderFactory implements OrderFactory {
    @Override
    public Pay createPay() {
        return new AliPay();
    }

    @Override
    public Refund createRefund() {
        return new AliRefund();
    }
}
