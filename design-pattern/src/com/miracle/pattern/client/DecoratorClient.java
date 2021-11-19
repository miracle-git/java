package com.miracle.pattern.client;

import com.miracle.pattern.decorator.AlarmBikeDecorator;
import com.miracle.pattern.decorator.BigBike;
import com.miracle.pattern.decorator.Bike;
import com.miracle.pattern.decorator.RSCBikeDecorator;

public class DecoratorClient {
    public static void run() {
        Bike bike = new BigBike();
        // 搭配防爆胎
        bike = new RSCBikeDecorator(bike);
        // 搭配喇叭(2个)
        bike = new AlarmBikeDecorator(bike);
        bike = new AlarmBikeDecorator(bike);
        System.out.println(bike.getDesc() + ",价格: " + bike.getPrice());
    }
}
