package com.miracle.pattern.observer;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyAllObservers() {
        System.out.println("老板完成自己的工作");
        System.out.println("老板视察公司情况");
        super.notifyAllObservers();
    }
}
