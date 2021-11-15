package com.miracle.pattern.client;

import com.miracle.pattern.singleton.SingletonEager;
import com.miracle.pattern.singleton.SingletonLazy;

public class SingletonClient {
    public static void run() {
        // 懒汉
        SingletonLazy.getInstance().process();
        // 饿汉
        SingletonEager.getInstance().process();
    }
}
