package com.miracle.pattern.strategy;

public class PromotionContext {
    private PromotionStrategy strategy;

    public PromotionContext(PromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(ProductOrder order) {
        return this.strategy.computePrice(order);
    }
}
