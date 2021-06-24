package com.miracle.optional;

import com.miracle.entity.UserInfo;

import java.util.Optional;

/**
 * 使用Optional简化对象为空判断
 * */
public class OptionalUserInfoTest {
    private static UserInfo userInfo;

    public static void main(String[] args) {
        UserInfo user = getUser("Miracle", 36);
        System.out.println(user);

        String name = getUserName(user);
        System.out.println(name);
    }

    public static UserInfo getUser(String name, int age) {
//        if (userInfo == null) {
//            return createUser(name, age);
//        }
//        return userInfo;
        return Optional.ofNullable(userInfo).orElse(createUser(name, age));
    }

    public static String getUserName(UserInfo userInfo) {
//        if (user != null) {
//            String name = user.getName();
//            if (name != null) {
//                return name.toLowerCase();
//            }
//        }
//        return null;
        return Optional.ofNullable(userInfo).map(user -> user.getName()).map(name -> name.toLowerCase()).orElse(null);
    }

    public static UserInfo createUser(String name, int age) {
        return new UserInfo(name, age);
    }
}
