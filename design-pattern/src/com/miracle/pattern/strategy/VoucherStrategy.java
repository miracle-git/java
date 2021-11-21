package com.miracle.pattern.strategy;

public class VoucherStrategy implements PromotionStrategy {
    private double voucher;

    public VoucherStrategy(double voucher) {
        this.voucher = voucher;
    }

    @Override
    public double computePrice(ProductOrder order) {
        if (order.getPrice() > this.voucher) {
            return order.getPrice() - this.voucher;
        }
        return 0;
    }
}
