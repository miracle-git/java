package com.miracle.optional;

import java.util.Optional;

/**
 * 使用Optional相关api(of,ofNullable,isPresent,ifPresent,orElse,orElseGet,filter,map)
 * */
public class OptionalApiTest {
    public static void main(String[] args) {
        // useOptionalOf(null); // 此时不允许传入空值，否则会报NullPointerException
        useOptionalOf("miracle");

        // useOptionalOfNullable(null); // 此时虽可以传入空值，但直接使用get仍然会报NoSuchElementException
        useOptionalOfNullable("miracle");

        useOptionalIsPresent(null);
        useOptionalIsPresent("miracle");

        useOptionalIfPresent(null);
        useOptionalIfPresent("miracle");

        useOptionalOrElse(null);
        useOptionalOrElse("miracle he");

        useOptionalOrElseGet(null);
        useOptionalOrElseGet("miracle he");

        useOptionalFilter("miracle");
        useOptionalFilter("miracle he");
    }

    // of不允许传递空值对象
    public static void useOptionalOf(String name) {
        Optional<String> optional = Optional.of(name);
        System.out.println(optional.get());
    }

    // ofNullable允许传递空值对象，但使用
    public static void useOptionalOfNullable(String name) {
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.get());
    }

    // isPresent可判断是否传递空值对象
    public static void useOptionalIsPresent(String name) {
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.isPresent() ? optional.get() : "");
    }

    // ifPresent可判断是否传入空值对象且只有非空才做处理
    public static void useOptionalIfPresent(String name) {
        // Optional.ofNullable(name).ifPresent(s -> System.out.println(s));
        Optional.ofNullable(name).ifPresent(System.out::println);
    }

    // orElse为空值对象设置默认值
    public static void useOptionalOrElse(String name) {
        String userName = Optional.ofNullable(name).orElse("miracle");
        System.out.println(userName);
    }

    // orElseGet为空值对象做预设处理
    public static void useOptionalOrElseGet(String name) {
        String userName = Optional.ofNullable(name).orElseGet(() -> {
            String fullName =  "miracle he";
            return fullName + " is learning optional api";
        });
        System.out.println(userName);
    }

    // filter实现参数过滤
    public static void useOptionalFilter(String name) {
        System.out.println(Optional.ofNullable(name).filter("miracle"::equals).isPresent());
    }
}
