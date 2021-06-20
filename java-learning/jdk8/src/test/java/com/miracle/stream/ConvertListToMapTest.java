package com.miracle.stream;

import com.miracle.entity.UserInfo;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream可将集合转化为Map(通过指定不同的key值来实现去重)
 * */
public class ConvertListToMapTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("miracle", 36));
        // userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("mike", 40));
        userInfos.add(new UserInfo("micky", 24));
        // 首先进行集合遍历
        userInfos.forEach(userInfo -> System.out.println(userInfo));
        // 创建集合的stream(串行/并行)
        Stream<UserInfo> stream = userInfos.stream();
        // 将串行流转化为map
        Map<String, UserInfo> userMap = stream.collect(Collectors.toMap(userInfo -> userInfo.getName(), userInfo -> userInfo));
        // 只有当指定不同key值时，才能实现去重
        userMap.forEach((s, userInfo) -> System.out.println(s + ":" + userInfo));
    }
}
