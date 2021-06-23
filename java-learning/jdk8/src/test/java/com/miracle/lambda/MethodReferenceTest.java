package com.miracle.lambda;

import com.miracle.entity.UserInfo;
import com.miracle.service.MathService;
import com.miracle.service.MessageService;
import com.miracle.service.UserInfoManager;

/**
 * 使用方法引入简化lambda表达式(静态方法引入，实例方法引入，构造函数引入，对象方法引入)
 * 必须保证引入方法签名与接口签名完全一致(包含参数个数类型，返回类型)
 * */
public class MethodReferenceTest {
    public static void main(String[] args) {
       staticMethodReference();
       instanceMethodReference();
       constructorMethodReference();
       objectMethodReference();
    }

    // 静态方法引入
    public static void staticMethodReference() {
        // 1.使用lambda表达式
        MathService<Integer> math1 = (a, b) -> MethodReferenceTest.sum(a, b);
        System.out.println(math1.add(2, 3));
        // 2.使用静态方法引入
        MathService<Integer> math2 = MethodReferenceTest::sum;
        System.out.println(math2.add(2, 3));
    }

    // 实例方法引入
    public static void instanceMethodReference() {
        MethodReferenceTest refer = new MethodReferenceTest();
        // 1.使用lambda表达式
        MathService<String> math1 = (a, b) -> refer.join(a, b);
        System.out.println(math1.add("miracle", "he"));
        // 2.使用实例方法引入
        MathService<String> math2 = refer::join;
        System.out.println(math2.add("miracle", "he"));
    }

    // 构造方法引入
    public static void constructorMethodReference() {
        // 1.使用lambda表达式
        UserInfoManager manager1 = (name, age) -> new UserInfo(name, age);
        UserInfo user1 = manager1.getUser("miracle", 36);
        System.out.println(user1);
        // 2.使用构造函数引入
        UserInfoManager manager2 = UserInfo::new;
        UserInfo user2 = manager2.getUser("miracle", 36);
        System.out.println(user2);
    }

    // 对象方法引入
    public static void objectMethodReference() {
        // 1.使用lambda表达式
        MessageService message1 = (user) -> user.detail();
        System.out.println(message1.display(new UserInfo("miracle", 36)));
        // 2.使用对象方法引入
        MessageService message2 = UserInfo::detail;
        System.out.println(message2.display(new UserInfo("miracle", 36)));
    }

    // 静态方法
    public static int sum(int a, int b) {
        return a + b;
    }

    // 实例方法
    public String join(String a, String b) {
        return a + " " + b;
    }
}
