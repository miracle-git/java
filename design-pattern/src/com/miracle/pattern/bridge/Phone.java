package com.miracle.pattern.bridge;

public abstract class Phone {
    // 通过组合的方式桥接颜色
    protected Color color;
    public abstract void run();

    public void setColor(Color color) {
        this.color = color;
    }
}
