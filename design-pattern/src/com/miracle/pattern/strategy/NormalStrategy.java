package com.miracle.pattern.strategy;

public class NormalStrategy implements PromotionStrategy {
    @Override
    public double computePrice(ProductOrder order) {
        return order.getPrice();
    }
}
