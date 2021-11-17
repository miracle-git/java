package com.miracle.pattern.adapter;

// 对象适配器
public class ObjectAdapter implements TargetModule {
    private OldModule old;

    public ObjectAdapter(OldModule old) {
        this.old = old;
    }

    @Override
    public void methodA() {
       if (this.old != null) {
           this.old.methodA();
       }
    }

    @Override
    public void methodB() {
        System.out.println("ObjectAdapter methodB");
    }

    @Override
    public void methodC() {
        System.out.println("ObjectAdapter methodC");
    }
}
