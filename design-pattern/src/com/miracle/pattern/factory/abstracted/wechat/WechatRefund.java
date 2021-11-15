package com.miracle.pattern.factory.abstracted.wechat;

import com.miracle.pattern.factory.abstracted.Refund;

public class WechatRefund implements Refund {
    @Override
    public void refund() {
        System.out.println("微信支付 统一退款实现");
    }
}
