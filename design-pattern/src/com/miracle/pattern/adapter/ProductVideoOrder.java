package com.miracle.pattern.adapter;

public class ProductVideoOrder extends PayGatewayAdapter {
    @Override
    public void unifiedorder() {
        System.out.println("ProductVideoOrder unifiedorder");
    }

    @Override
    public void refund() {
        System.out.println("ProductVideoOrder refund");
    }
}
