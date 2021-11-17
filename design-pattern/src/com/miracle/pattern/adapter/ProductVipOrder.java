package com.miracle.pattern.adapter;

public class ProductVipOrder extends PayGatewayAdapter {
    @Override
    public void unifiedorder() {
        System.out.println("ProductVipOrder unifiedorder");
    }

    @Override
    public void refund() {
        System.out.println("ProductVipOrder refund");
    }

    @Override
    public void sendRedPack() {
        System.out.println("ProductVipOrder sendRedPack");
    }
}
