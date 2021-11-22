package com.miracle.pattern.command;

public class ConditionReceiver {
    public void on() {
        System.out.println("打开空调");
    }

    public void off() {
        System.out.println("关闭空调");
    }

    public void cool() {
        System.out.println("空调开始制冷");
    }

    public void warm() {
        System.out.println("空调开始制暖");
    }
}
