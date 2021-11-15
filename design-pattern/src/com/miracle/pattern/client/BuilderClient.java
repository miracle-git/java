package com.miracle.pattern.client;

import com.miracle.pattern.builder.Computer;
import com.miracle.pattern.builder.ComputerDirector;
import com.miracle.pattern.builder.HigherComputerBuilder;
import com.miracle.pattern.builder.LowerComputerBuilder;

public class BuilderClient {
    public static void run() {
        // 建造者模式 - 低配版电脑
        Computer lowerComputer = ComputerDirector.create(new LowerComputerBuilder());
        System.out.println(lowerComputer);
        // 建造者模式 - 高配版电脑
        Computer higherComputer = ComputerDirector.create(new HigherComputerBuilder());
        System.out.println(higherComputer);
    }
}
