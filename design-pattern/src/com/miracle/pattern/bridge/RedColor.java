package com.miracle.pattern.bridge;

public class RedColor implements Color {
    @Override
    public void useColor() {
        System.out.println("红色");
    }
}
