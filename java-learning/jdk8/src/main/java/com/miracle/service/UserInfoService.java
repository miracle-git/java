package com.miracle.service;

import com.miracle.entity.UserInfo;

import java.util.List;
import java.util.stream.Stream;

public interface UserInfoService {
    // 对用户集合进行按年龄进行降序排序，并获取用户名包含"mi"的后两位用户
    Stream<UserInfo> filter(List<UserInfo> users);
    // 对筛选结果进行打印
    default void display(Stream<UserInfo> users) {
        users.forEach(user -> System.out.println(user));
    }
}
