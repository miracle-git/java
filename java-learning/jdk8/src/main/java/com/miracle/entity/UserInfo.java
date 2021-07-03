package com.miracle.entity;

import com.miracle.aop.Logger;

import java.util.Objects;

@Logger
public class UserInfo {
    private String name;
    private int age;

    @Logger
    public String nickName;

    public UserInfo() {
    }

    @Logger
    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Deprecated
    public String detail() {
        return "name: " + this.getName() + ", age: " + this.getAge();
    }

    @Logger
    private String profile(boolean isPublic) {
        if (isPublic) return detail();
        return detail() + ", nickName: " + this.nickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return age == userInfo.age && name.equals(userInfo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "UserInfo{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
