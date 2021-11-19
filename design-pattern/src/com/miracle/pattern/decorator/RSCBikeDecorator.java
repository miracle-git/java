package com.miracle.pattern.decorator;

public class RSCBikeDecorator extends BikeDecorator {
    private String desc = "增加一个防爆胎";
    private Bike bike;

    public RSCBikeDecorator(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getDesc() {
        return this.bike.getDesc() + "," + desc;
    }

    @Override
    public int getPrice() {
        return this.bike.getPrice() + 100;
    }
}
