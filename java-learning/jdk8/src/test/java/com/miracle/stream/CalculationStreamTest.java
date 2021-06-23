package com.miracle.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.OptionalLong;
import java.util.stream.LongStream;

/**
 * 创建流(串行流、并行流)
 * 串行流：单线程操作，适合于数据量较少的场景
 * 并行流：多线程操作，适合于超大数据量的场景
 * */
public class CalculationStreamTest {
    public static void main(String[] args) {
        // 创建串行流
        displayCalculateResult(false);
        // 创建并行流
        displayCalculateResult(true);
    }

    // 测试计算结果
    public static void displayCalculateResult(Boolean parallel) {
        Instant start = Instant.now();
        System.out.println(parallel ? "并行流" : "串行流");
        LongStream stream = LongStream.rangeClosed(1, 50000000000L);
        OptionalLong result = (parallel ? stream.parallel() : stream).reduce((a, b) -> a + b);
        System.out.println("计算结果：" + result.getAsLong());
        Instant end = Instant.now();
        System.out.println(("五百亿求和耗费时间：" + Duration.between(start, end).toMillis() / 1000 + "秒"));
    }
}
