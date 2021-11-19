package com.miracle.pattern.decorator;

public class AlarmBikeDecorator extends BikeDecorator {
    private String desc = "增加一个喇叭";
    private Bike bike;

    public AlarmBikeDecorator(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getDesc() {
        return this.bike.getDesc() + "," + desc;
    }

    @Override
    public int getPrice() {
        return this.bike.getPrice() + 50;
    }
}
