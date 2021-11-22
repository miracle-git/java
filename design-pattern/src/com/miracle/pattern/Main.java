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
        // 装饰器模式
        DecoratorClient.run();
        // 代理模式
        ProxyClient.run();
        // 外观模式
        FacadeClient.run();
        // 享元模式
        FlyweightClient.run();
        // 策略模式
        StrategyClient.run();
        // 模板方法模式
        TemplateMethodClient.run();
        // 观察者模式
        ObserverClient.run();
        // 责任链模式
        ResponsibilityChainClient.run();
    }
}
