package com.miracle.pattern.strategy;

public class DiscountStrategy implements PromotionStrategy {
    private double rate;

    public DiscountStrategy(double rate) {
        this.rate = rate;
    }

    @Override
    public double computePrice(ProductOrder order) {
        return order.getPrice() * rate;
    }
}
