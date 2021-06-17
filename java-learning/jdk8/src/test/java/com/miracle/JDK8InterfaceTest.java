package com.miracle;

public class JDK8InterfaceTest {
    public static void main(String[] args) {
        JDK8Interface jdk8 = new JDK8InterfaceImpl();
        jdk8.addOrder();
        jdk8.getDefaultOrder();
        JDK8Interface.getStaticOrder();
    }
}
