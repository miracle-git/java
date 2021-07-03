package com.miracle.reflection;

import com.miracle.aop.Logger;
import com.miracle.entity.UserInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用反射api(getField, getMethod, getConstructor, getDeclaredField, getDeclaredMethod, getDeclaredConstructor)
 * */
public class ReflectionApiTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> userClass = Class.forName("com.miracle.entity.UserInfo");
        UserInfo userInfo = new UserInfo();

        useGetField(userClass, userInfo);
        useGetMethod(userClass, userInfo);
        useGetAnnotation(userClass);
    }

    public static void useGetField(Class<?> userClass, UserInfo userInfo) throws NoSuchFieldException, IllegalAccessException {
        // getFields只能获取类的公共属性
        Field[] publicFields = userClass.getFields();
        for (Field field: publicFields) {
            System.out.println(field);
        }
        // getDeclaredFields可获取所有的类属性(包含公有，私有，保护)
        Field[] fields = userClass.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field);
        }
        // getDeclaredField可获取指定名称的属性
        Field nickName = userClass.getDeclaredField("nickName");
        nickName.set(userInfo, "miracle he");
        System.out.println(userInfo.nickName);

        Field userName = userClass.getDeclaredField("name");
        // setAccessible改变私有属性的访问权限
        userName.setAccessible(true);
        userName.set(userInfo, "miracle");
        System.out.println(userInfo.getName());
    }

    public static void useGetMethod(Class<?> userClass, UserInfo userInfo) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // getDeclaredMethod可获取指定名称的方法
        Method detail = userClass.getDeclaredMethod("detail");
        System.out.println(detail.invoke(userInfo));

        Method profile = userClass.getDeclaredMethod("profile", boolean.class);
        // setAccessible改变私有属性的访问权限
        profile.setAccessible(true);
        System.out.println(profile.invoke(userInfo, false));
    }

    public static void useGetAnnotation(Class<?> userClass) throws NoSuchMethodException, NoSuchFieldException {
        // 获取在UserInfo类上的注解
        Logger userInfoAnnotation = userClass.getDeclaredAnnotation(Logger.class);
        System.out.println(userInfoAnnotation);

        // 获取在字段上的注解
        Field nickName = userClass.getDeclaredField("nickName");
        Logger nickNameAnnotation = nickName.getDeclaredAnnotation(Logger.class);
        System.out.println(nickNameAnnotation);

        // 获取在方法上的注解
        Method profile = userClass.getDeclaredMethod("profile", boolean.class);
        Logger profileAnnotation = profile.getDeclaredAnnotation(Logger.class);
        System.out.println(profileAnnotation);

        // 获取在构造函数上的注解
        Constructor<?> constructor = userClass.getDeclaredConstructor(String.class, int.class);
        Logger constructorAnnotation = constructor.getDeclaredAnnotation(Logger.class);
        System.out.println(constructorAnnotation);
    }
}
