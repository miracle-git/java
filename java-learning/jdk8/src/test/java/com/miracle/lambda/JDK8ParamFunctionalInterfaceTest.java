package com.miracle.lambda;

import com.miracle.jdk8.JDK8ParamFunctionalInterface;

public class JDK8ParamFunctionalInterfaceTest {
    public static void main(String[] args) {
        // 1.使用匿名内部类的形式调用带参数的函数接口
        String result = new JDK8ParamFunctionalInterface() {
            @Override
            public String getFullName(String firstName, String lastName) {
                return firstName + ' ' + lastName;
            }
        }.getFullName("miracle", "he");
        System.out.println(result);
        // 2.使用lambda的形式调用带参数的函数接口
        System.out.println(((JDK8ParamFunctionalInterface) (firstName, lastName) -> firstName + ' ' + lastName).getFullName("miracle", "he"));
    }
}
