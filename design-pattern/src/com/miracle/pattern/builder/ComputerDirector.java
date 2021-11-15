package com.miracle.pattern.builder;

public class ComputerDirector {
    public static Computer create(ComputerBuilder builder) {
        builder.buildCpu()
               .buildDisk()
               .buildMemory()
               .buildMainboard()
               .buildPower();

        return builder.createComputer();
    }
}
