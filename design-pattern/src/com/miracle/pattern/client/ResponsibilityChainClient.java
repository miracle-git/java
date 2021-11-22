package com.miracle.pattern.client;

import com.miracle.pattern.chain.*;

public class ResponsibilityChainClient {
    public static void run() {
        RiskControlManager normal = new NormalRiskControlManager("初级风控");
        RiskControlManager middle = new MiddleRiskControlManager("中级风控");
        RiskControlManager high = new HighRiskControlManager("高级风控");
        // 形成调用链
        normal.setSuperior(middle);
        middle.setSuperior(high);

        Request request = new Request();
        request.setRequestType(RequestType.TRANSFER.name());
        request.setMoney(2000);
        normal.handlerRequest(request);

        request.setRequestType(RequestType.CASH_OUT.name());
        request.setMoney(20000);
        normal.handlerRequest(request);
    }
}
