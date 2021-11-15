package com.miracle.pattern.singleton;

/**
 * 单例设计模式 - 饿汉实现方式
 * */
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public void process() {
        System.out.println("调用成功");
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
