package com.miracle.stream;

import com.miracle.entity.UserInfo;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 集合的结果筛选(skip, limit)
 * */
public class ListResultFilterTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("mike", 40));
        userInfos.add(new UserInfo("micky", 24));
        // 使用limit对结果进行筛选(前两条数据)
        displayUserInfos(getPrevUserInfos(userInfos));
        // 使用skip跳过某些数据进行筛选(后两条数据)
        displayUserInfos(getNextUserInfos(userInfos));
    }

    // 使用limit对结果进行筛选(前两条数据)
    static Stream<UserInfo> getPrevUserInfos(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        return stream.limit(2);
    }

    // 使用skip跳过某些数据进行筛选(后两条数据)
    static Stream<UserInfo> getNextUserInfos(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        return stream.skip(1);
    }

    // 对集合结果进行打印
    static void displayUserInfos(Stream<UserInfo> userInfos) {
        userInfos.forEach(userInfo -> System.out.println(userInfo));
    }
}
