package com.miracle.pattern;

import com.miracle.pattern.client.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 单例模式
        SingletonClient.run();
        // 工厂模式 - 简单工厂
        SimpleFactoryClient.run();
        // 工厂模式 - 工厂方法
        FactoryMethodClient.run();
        // 工厂模式 - 抽象工厂
        AbstractFactoryClient.run();
        // 原型模式
        PrototypeClient.run();
        // 建造者模式
        BuilderClient.run();
        // 适配器模式
        AdapterClient.run();
        // 桥接模式
        BridgeClient.run();
        // 组合模式
        CompsiteClient.run();
    }
}
