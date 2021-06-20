package com.miracle.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 使用lambda表达式简化集合遍历
 * */
public class JDK8ListTransverseTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("miracle");
        arrayList.add("mike");
        arrayList.add("micky");
        // 1.使用匿名内部类的形式进行集合遍历
        arrayList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        // 2.使用lambda表达式的形式进行集合遍历
        arrayList.forEach(s -> System.out.println(s));
    }
}
