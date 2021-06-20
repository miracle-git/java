package com.miracle.stream;

import com.miracle.entity.UserInfo;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream可将集合转化为Set(通过重写对象equals和hashCode函数来实现去重)
 * */
public class ConvertListToSetTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("mike", 40));
        userInfos.add(new UserInfo("micky", 24));
        // 首先进行集合遍历
        userInfos.forEach(userInfo -> System.out.println(userInfo));
        // 创建集合的stream(串行/并行)
        Stream<UserInfo> stream = userInfos.stream();
        // 将串行流转化为set
        Set<UserInfo> userSet = stream.collect(Collectors.toSet());
        // 只有当UserInfo重写了equals和hashCode函数，才能实现去重
        userSet.forEach(userInfo -> System.out.println(userInfo));
    }
}
