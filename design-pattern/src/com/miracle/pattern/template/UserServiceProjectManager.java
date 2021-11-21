package com.miracle.pattern.template;

public class UserServiceProjectManager extends ProjectManager {
    @Override
    protected void develop() {
        System.out.println("开发周期10天");
    }

    @Override
    protected void test() {
        System.out.println("功能测试，压力测试，单元测试");
    }

    @Override
    protected void deploy() {
        System.out.println("灰度发布，全量上线");
    }
}
