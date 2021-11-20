package com.miracle.pattern.proxy;

public class DigitalSellProxy implements DigitalSell {
    private DigitalSellReal real = new DigitalSellReal();

    @Override
    public void sell() {
        this.selectAddress();
        this.makeAd();
        real.sell();
    }

    private void selectAddress() {
        System.out.println("选择人流量很高的地址");
    }

    private void makeAd() {
        System.out.println("投放广告");
    }
}
