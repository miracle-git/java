package com.miracle.jdk8;

/**
 * 定义带参数的函数接口
 * */
@FunctionalInterface
public interface JDK8ParamFunctionalInterface {
    String getFullName(String firstName, String lastName);
}
