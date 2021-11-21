package com.miracle.pattern.strategy;

public interface PromotionStrategy {
    double computePrice(ProductOrder order);
}
