package com.miracle;

import com.miracle.service.OrderService;
import com.miracle.service.OrderServiceImpl;

public class OrderServiceTest {
    public static void main(String[] args) {
        // 1.使用new的实现类的形式调用接口
        OrderService orderService = new OrderServiceImpl();
        orderService.addOrder();
        // 2.使用匿名内部类的形式调用接口
        new OrderService() {
            @Override
            public void addOrder() {
                System.out.println("使用匿名内部类的形式调用接口");
            }
        }.addOrder();
        // 3.使用lambda的形式调用接口
        ((OrderService) () -> System.out.println("使用lambda的形式调用接口")).addOrder();
    }
}
