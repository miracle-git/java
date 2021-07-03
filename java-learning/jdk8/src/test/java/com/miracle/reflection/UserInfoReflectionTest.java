package com.miracle.reflection;

import com.miracle.entity.UserInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射创建UserInfo实例
 * */
public class UserInfoReflectionTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        // 1.使用UserInfo.class来创建(使用无参构造函数)
        Class<?> userClass1 = UserInfo.class;
        UserInfo userInfo1 = (UserInfo)userClass1.newInstance();
        System.out.println(userInfo1);

        // 2.使用Class.forName来创建
        Class<?> userClass2 = Class.forName("com.miracle.entity.UserInfo");
        System.out.println(userClass1 == userClass2);
        // 使用getDeclaredConstructor调用有参构造函数
        Constructor<?> constructor = userClass2.getDeclaredConstructor(String.class, int.class);
        UserInfo userInfo2 = (UserInfo)constructor.newInstance("miracle", 36);
        System.out.println(userInfo2);

        // 3.使用new创建
        UserInfo user = new UserInfo();
        Class<?> userClass3 = user.getClass();
        System.out.println(userClass1 == userClass3);
    }
}
