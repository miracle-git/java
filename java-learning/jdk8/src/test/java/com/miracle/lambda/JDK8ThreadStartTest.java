package com.miracle.lambda;

/**
 * 使用lambda表达式简化线程启动
 * */
public class JDK8ThreadStartTest {
    public static void main(String[] args) {
        // 1.使用匿名内部类的形式进行线程启动
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程：" + Thread.currentThread().getName() + ",即将启动!");
            }
        }).start();
        // 2.使用lambda表达式的形式进行线程启动
        new Thread(() -> System.out.println("当前线程：" + Thread.currentThread().getName() + ",即将启动!")).start();
    }
}
