package com.miracle.pattern.factory.abstracted;

/**
 * 超级工厂
 * */
public interface OrderFactory {
    Pay createPay();
    Refund createRefund();
}
