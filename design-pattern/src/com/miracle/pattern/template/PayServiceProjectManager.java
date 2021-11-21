package com.miracle.pattern.template;

public class PayServiceProjectManager extends ProjectManager {
    @Override
    protected void develop() {
        System.out.println("开发周期30天");
    }

    @Override
    protected void test() {
        System.out.println("功能测试，安全测试，压力测试");
    }

    @Override
    protected void deploy() {
        System.out.println("全量上线");
    }
}
