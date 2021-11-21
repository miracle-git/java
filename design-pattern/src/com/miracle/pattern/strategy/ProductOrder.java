package com.miracle.pattern.strategy;

public class ProductOrder {
    private double price;
    private int userId;
    private int productId;

    public ProductOrder(double price, int userId, int productId) {
        this.price = price;
        this.userId = userId;
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
