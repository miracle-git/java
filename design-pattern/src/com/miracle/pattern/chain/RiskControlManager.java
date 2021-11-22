package com.miracle.pattern.chain;

public abstract class RiskControlManager {
    protected String name;
    protected RiskControlManager superior;

    public RiskControlManager(String name) {
        this.name = name;
    }

    public void setSuperior(RiskControlManager superior) {
        this.superior = superior;
    }

    public abstract void handlerRequest(Request request);
}
