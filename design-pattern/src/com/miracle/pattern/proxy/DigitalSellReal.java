package com.miracle.pattern.proxy;

public class DigitalSellReal implements DigitalSell {
    @Override
    public void sell() {
        System.out.println("销售华为手机");
    }
}
