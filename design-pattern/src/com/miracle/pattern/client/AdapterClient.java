package com.miracle.pattern.client;

import com.miracle.pattern.adapter.TargetModule;
import com.miracle.pattern.adapter.PayGateway;
import com.miracle.pattern.adapter.ProductVideoOrder;
import com.miracle.pattern.adapter.ProductVipOrder;
import com.miracle.pattern.adapter.ClassAdapter;
import com.miracle.pattern.adapter.ObjectAdapter;
import com.miracle.pattern.adapter.OldModule;

public class AdapterClient {
    public static void run() {
        // 接口适配器
        PayGateway videoOrder = new ProductVideoOrder();
        videoOrder.unifiedorder();
        videoOrder.refund();

        PayGateway vipOrder = new ProductVipOrder();
        vipOrder.unifiedorder();
        vipOrder.refund();
        vipOrder.sendRedPack();

        // 类的适配器
        TargetModule clsAdapter = new ClassAdapter();
        clsAdapter.methodA();
        clsAdapter.methodB();
        clsAdapter.methodC();

        // 对象适配器
        TargetModule objAdapter = new ObjectAdapter(new OldModule());
        objAdapter.methodA();
        objAdapter.methodB();
        objAdapter.methodC();
    }
}
