package com.miracle;

import com.miracle.jdk8.JDK8Interface;
import com.miracle.jdk8.JDK8InterfaceImpl;

public class JDK8InterfaceTest {
    public static void main(String[] args) {
        JDK8Interface jdk8Interface = new JDK8InterfaceImpl();
        jdk8Interface.addOrder();
        jdk8Interface.getDefaultOrder();
        JDK8Interface.getStaticOrder();
    }
}
