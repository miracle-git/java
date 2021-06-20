package com.miracle.stream;

import com.miracle.entity.UserInfo;
import com.miracle.service.UserInfoService;
import com.miracle.service.UserInfoServiceImpl;

import java.util.ArrayList;
import java.util.stream.Stream;

public class UserInfoServiceTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("miracle", 36));
        userInfos.add(new UserInfo("mike", 40));
        userInfos.add(new UserInfo("micky", 24));
        // 对用户集合进行按年龄进行降序排序，并获取用户名包含"mi"的后两位用户
        UserInfoService service = new UserInfoServiceImpl();
        Stream<UserInfo> result = service.filter(userInfos);
        service.display(result);
    }
}
