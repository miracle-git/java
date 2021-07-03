package com.miracle.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用反射越过泛型检查
 * */
public class ReflectionGenericTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<>();
        list.add("miracle");
        // list.add(36); // 类型不匹配报错
        System.out.println(list);

        Class<? extends List> listClass = list.getClass();
        Method add = listClass.getDeclaredMethod("add", Object.class);
        add.invoke(list, "miracle");
        add.invoke(list, 36); // 可传入任意类型，越过检查
        System.out.println(list);
    }
}
