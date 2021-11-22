package com.miracle.pattern.chain;

public class NormalRiskControlManager extends RiskControlManager {
    public NormalRiskControlManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.valueOf(request.getRequestType()) != null && request.getMoney() <= 1000) {
            System.out.println("普通操作，输入支付密码即可");
            System.out.println(this.name + ": " + request.getRequestType() + ", 金额：" + request.getMoney() + " 处理完成");
        } else {
            if (this.superior != null) {
                this.superior.handlerRequest(request);
            }
        }
    }
}
