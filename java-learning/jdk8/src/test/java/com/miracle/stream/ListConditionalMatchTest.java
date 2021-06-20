package com.miracle.stream;

import com.miracle.entity.UserInfo;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 集合的条件匹配(allMatch, anyMatch, noneMatch, filter)
 * */
public class ListConditionalMatchTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("mike", 40));
        userInfos.add(new UserInfo("micky", 24));
        // 使用allMatch进行全匹配
        System.out.println("allMatch: " + getAllMatch(userInfos));
        // 使用anyMatch进行任意匹配
        System.out.println("anyMatch: " + getAnyMatch(userInfos));
        // 使用noneMatch进行无匹配
        System.out.println("noneMatch: " + getNoneMatch(userInfos));
        // 使用filter进行条件匹配
        getFilterMatch(userInfos).forEach(userInfo -> System.out.println(userInfo));
    }

    // 使用allMatch进行全匹配
    static boolean getAllMatch(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        return stream.allMatch(userInfo -> userInfo.getName().equals("miracle"));
    }

    // 使用anyMatch进行任意匹配
    static boolean getAnyMatch(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        return stream.anyMatch(userInfo -> userInfo.getName().equals("miracle"));
    }

    // 使用noneMatch进行无匹配
    static boolean getNoneMatch(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        return stream.noneMatch(userInfo -> userInfo.getName().equals("miracle"));
    }

    // 使用filter进行条件匹配
    static Stream<UserInfo> getFilterMatch(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        return stream.filter(userInfo -> userInfo.getName().equals("miracle") && userInfo.getAge() > 35);
    }
}
