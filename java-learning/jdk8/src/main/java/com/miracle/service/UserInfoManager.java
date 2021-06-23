package com.miracle.service;

import com.miracle.entity.UserInfo;

public interface UserInfoManager {
    UserInfo getUser(String name, int age);
}
