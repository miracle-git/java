package com.miracle.stream;

import com.miracle.entity.UserInfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 集合的结果排序(sorted)
 * */
public class ListComparatorTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("mike", 40));
        userInfos.add(new UserInfo("micky", 24));
        // 利用sorted函数对集合进行(按年龄)升序
        displayUserInfos(getAsc(userInfos));
        // 利用sorted函数对集合进行(按年龄)降序
        displayUserInfos(getDesc(userInfos));
    }

    // 利用sorted函数对集合进行(按年龄)升序
    static Stream<UserInfo> getAsc(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        return stream.sorted((userInfo1, userInfo2) -> userInfo1.getAge() - userInfo2.getAge());
    }

    // 利用sorted函数对集合进行(按年龄)降序
    static Stream<UserInfo> getDesc(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        return stream.sorted((userInfo1, userInfo2) -> userInfo2.getAge() - userInfo1.getAge());
    }

    // 对集合结果进行打印
    static void displayUserInfos(Stream<UserInfo> userInfos) {
        userInfos.forEach(userInfo -> System.out.println(userInfo));
    }
}
