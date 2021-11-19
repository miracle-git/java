package com.miracle.pattern.decorator;

public class BigBike implements Bike {
    private  String desc = "大号自行车";

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
