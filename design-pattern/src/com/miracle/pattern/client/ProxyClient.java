package com.miracle.pattern.client;

import com.miracle.pattern.proxy.DigitalSell;
import com.miracle.pattern.proxy.DigitalSellProxy;

public class ProxyClient {
    public static void run() {
        DigitalSell proxy = new DigitalSellProxy();
        proxy.sell();
    }
}
