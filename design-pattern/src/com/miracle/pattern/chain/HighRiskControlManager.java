package com.miracle.pattern.chain;

public class HighRiskControlManager extends RiskControlManager {
    public HighRiskControlManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.valueOf(request.getRequestType()) != null && request.getMoney() > 10000) {
            System.out.println("超大额操作，输入支付密码+短信验证码+人脸识别即可");
            System.out.println(this.name + ": " + request.getRequestType() + ", 金额：" + request.getMoney() + " 处理完成");
        } else {
            if (this.superior != null) {
                this.superior.handlerRequest(request);
            }
        }
    }
}
