package com.miracle.pattern.client;

import com.miracle.pattern.strategy.*;

public class StrategyClient {
    public static void run() {
        ProductOrder order = new ProductOrder(800, 1, 32);
        PromotionContext context;
        double finalPrice;
        // 根据不同策略计算不同的活动价格
        context = new PromotionContext(new NormalStrategy());
        finalPrice = context.executeStrategy(order);
        System.out.println("NormalStrategy: " + finalPrice);

        context = new PromotionContext(new DiscountStrategy(0.8));
        finalPrice = context.executeStrategy(order);
        System.out.println("DiscountStrategy: " + finalPrice);

        context = new PromotionContext(new VoucherStrategy(100));
        finalPrice = context.executeStrategy(order);
        System.out.println("VoucherStrategy: " + finalPrice);
    }
}
