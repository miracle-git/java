package com.miracle.pattern.bridge;

public class BlueColor implements Color {
    @Override
    public void useColor() {
        System.out.println("蓝色");
    }
}
