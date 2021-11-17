package com.miracle.pattern.adapter;

// 类的适配器
public class ClassAdapter extends OldModule implements TargetModule {
    @Override
    public void methodB() {
        System.out.println("ClassAdapter methodB");
    }

    @Override
    public void methodC() {
        System.out.println("ClassAdapter methodC");
    }
}
