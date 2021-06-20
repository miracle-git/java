package com.miracle.lambda;

import com.miracle.entity.UserInfo;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 使用lambda表达式简化集合排序
 * */
public class JDK8ListComparatorTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("mike", 40));
        userInfos.add(new UserInfo("micky", 24));
        // 1.使用匿名内部类的形式进行集合比较
        userInfos.sort(new Comparator<UserInfo>() {
            @Override
            public int compare(UserInfo o1, UserInfo o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        userInfos.forEach(userInfo -> System.out.println(userInfo));
        // 2.使用lambda表达式的形式进行集合排序
        userInfos.sort((o1, o2) -> o1.getAge() - o2.getAge());
        userInfos.forEach(userInfo -> System.out.println(userInfo));
    }
}
