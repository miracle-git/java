package com.miracle.pattern.factory.abstracted.ali;

import com.miracle.pattern.factory.abstracted.Refund;

public class AliRefund implements Refund {
    @Override
    public void refund() {
        System.out.println("支付宝支付 统一退款实现");
    }
}
