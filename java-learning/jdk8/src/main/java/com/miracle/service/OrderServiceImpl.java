package com.miracle.service;

public class OrderServiceImpl implements OrderService {
    @Override
    public void addOrder() {
        System.out.println("使用new的实现类的形式调用接口");
    }
}
