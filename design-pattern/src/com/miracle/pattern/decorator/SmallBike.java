package com.miracle.pattern.decorator;

public class SmallBike implements Bike {
    private  String desc = "小号自行车";

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
