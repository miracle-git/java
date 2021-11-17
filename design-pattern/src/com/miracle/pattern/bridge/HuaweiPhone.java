package com.miracle.pattern.bridge;

public class HuaweiPhone extends Phone {
    public HuaweiPhone(Color color) {
        super.setColor(color);
    }

    @Override
    public void run() {
        color.useColor();
        System.out.println("华为手机");
    }
}
