package com.miracle.service;

import com.miracle.entity.UserInfo;

import java.util.List;
import java.util.stream.Stream;

public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public Stream<UserInfo> filter(List<UserInfo> users) {
        Stream<UserInfo> stream = users.stream();
        return stream.sorted((o1, o2) -> o2.getAge() - o1.getAge())
                     .filter(user -> user.getName().contains("mi"))
                     .skip(1).limit(2);
    }
}
