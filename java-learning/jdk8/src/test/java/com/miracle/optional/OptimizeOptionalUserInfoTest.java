package com.miracle.optional;

import com.miracle.entity.UserInfo;

import java.util.Optional;

/**
 * 使用Optional优化操作
 * */
public class OptimizeOptionalUserInfoTest {
    private static UserInfo userInfo;

    public static void main(String[] args) {
        displayUserName(null);
        displayUserName("miracle");

        displayUserInfo();
        displayUserNameToLower();
    }

    // 使用isPresent来简化非空操作
    public static void displayUserName(String name) {
        Optional.ofNullable(name).ifPresent(System.out::println);
    }

    // 使用orElseGet来简化预设处理(配合方法引入)
    public static void displayUserInfo() {
        UserInfo result = Optional.ofNullable(userInfo).orElseGet(OptimizeOptionalUserInfoTest::createDefaultUser);
        System.out.println(result);
    }

    // 使用map来简化流式操作
    public static void displayUserNameToLower() {
        String userName = Optional.ofNullable(createUser()).map(user -> user.getName()).map(name -> name.toLowerCase()).orElse("");
        System.out.println(userName);
    }

    private static UserInfo createUser() {
        return new UserInfo("miracle", 36);
    }

    private static UserInfo createDefaultUser() {
        userInfo = createUser();
        return userInfo;
    }
}
