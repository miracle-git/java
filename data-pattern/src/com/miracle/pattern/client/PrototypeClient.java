package com.miracle.pattern.client;

import com.miracle.pattern.prototype.Person;

import java.io.IOException;

public class PrototypeClient {
    public static void run() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Person p1 = new Person();
        p1.setName("miracle");
        p1.setAge(36);
        p1.getList().add("aaa");

        // 浅拷贝
        Person p2 = p1.clone();
        p2.setName("miracle he");
        p2.getList().add("bbb");

        // 深拷贝
        Person p3 = p1.deepClone();
        p3.setName("miracle he");
        p3.getList().add("ccc");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
