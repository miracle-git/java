package com.miracle.pattern;

import com.miracle.pattern.singleton.SingletonEager;
import com.miracle.pattern.singleton.SingletonLazy;

public class Main {

    public static void main(String[] args) {
        // 单例模式
        SingletonLazy.getInstance().process();
        SingletonEager.getInstance().process();
    }
}
