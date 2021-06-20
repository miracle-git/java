package com.miracle.stream;

import com.miracle.entity.UserInfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 集合的数学运算(如求和，最大值，最小值等)
 * */
public class ListMathOperationTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("mike", 40));
        userInfos.add(new UserInfo("micky", 24));
        // 利用reduce函数对集合进行求和
        System.out.println("sum: " + getSum(userInfos));
        // 利用max,min函数对结合求最大，最小值
        System.out.println("max: " + getMax(userInfos));
        System.out.println("min: " + getMin(userInfos));
    }

    // 利用reduce函数对集合进行求和
    static int getSum(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        UserInfo userInfo = new UserInfo("sum", 0);
        Optional<UserInfo> sum = stream.reduce((userInfo1, userInfo2) -> {
            userInfo.setAge(userInfo1.getAge() + userInfo2.getAge());
            return userInfo;
        });
        return sum.get().getAge();
    }

    // 利用max函数对结合求最大值
    static int getMax(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        Optional<UserInfo> max = stream.max(Comparator.comparingInt(UserInfo::getAge));
        return max.get().getAge();
    }

    // 利用min函数对结合求最小值
    static int getMin(ArrayList<UserInfo> userInfos) {
        Stream<UserInfo> stream = userInfos.stream();
        Optional<UserInfo> min = stream.min(Comparator.comparingInt(UserInfo::getAge));
        return min.get().getAge();
    }
}
