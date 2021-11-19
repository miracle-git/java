package com.miracle.pattern.decorator;

public abstract class BikeDecorator implements Bike {
    private String desc;

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
