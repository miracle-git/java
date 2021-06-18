package com.miracle.jdk8;

/**
 * 函数接口使用@FunctionalInterface来标识
 * */
@FunctionalInterface
public interface JDK8FunctionalInterface {
    // 函数接口中只能定义一个抽象方法
    void get();

    default void add() {
        System.out.println("函数接口中可定义默认方法");
    }

    // 函数接口中可定义Object父类中的方法
    String toString();
}
