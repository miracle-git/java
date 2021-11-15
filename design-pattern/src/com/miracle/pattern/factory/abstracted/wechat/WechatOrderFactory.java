package com.miracle.pattern.factory.abstracted.wechat;

import com.miracle.pattern.factory.abstracted.OrderFactory;
import com.miracle.pattern.factory.abstracted.Pay;
import com.miracle.pattern.factory.abstracted.Refund;

public class WechatOrderFactory implements OrderFactory {
    @Override
    public Pay createPay() {
        return new WechatPay();
    }

    @Override
    public Refund createRefund() {
        return new WechatRefund();
    }
}
