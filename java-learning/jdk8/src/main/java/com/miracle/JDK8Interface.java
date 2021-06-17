package com.miracle;

/**
 * JDK 1.8开始 支持使用static和default修饰 可以写方法体，不需要子类重写
 **/
public interface JDK8Interface {
    // 抽象方法
    void addOrder();

    // 默认方法
    default void getDefaultOrder() {
        System.out.println("This is default method");
    }

    // 静态方法
    static void getStaticOrder() {
        System.out.println("This is static method");
    }
}
