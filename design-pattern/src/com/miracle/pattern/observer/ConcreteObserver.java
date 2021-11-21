package com.miracle.pattern.observer;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name + "发现老板到来，暂停摸鱼，回归工作");
    }
}
