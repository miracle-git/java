package com.miracle.pattern.adapter;

public interface PayGateway {
    // 下单
    void unifiedorder();
    // 退款
    void refund();
    // 查询支付状态
    void query();
    // 发红包
    void sendRedPack();
}
