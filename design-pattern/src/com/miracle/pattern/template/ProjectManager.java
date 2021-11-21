package com.miracle.pattern.template;

public abstract class ProjectManager {
    public final void process() {
        this.review();
        this.design();
        this.develop();
        this.test();
        this.deploy();
    }

    protected void review() { System.out.println("项目需求评审"); }

    protected void design() {
        System.out.println("UI原型设计");
    }

    protected abstract void develop();
    protected abstract void test();
    protected abstract void deploy();
}
