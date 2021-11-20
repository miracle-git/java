package com.miracle.pattern.flyweight;

public class ConcreteWebsite extends CloudWebsite {
    private String category;

    public ConcreteWebsite(String category) {
        this.category = category;
    }

    @Override
    public void run(Company company) {
        System.out.println("网站分类：" + this.category + ",公司：" + company.getName());
    }
}
