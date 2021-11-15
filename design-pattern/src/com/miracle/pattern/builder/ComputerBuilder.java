package com.miracle.pattern.builder;

public interface ComputerBuilder {
    ComputerBuilder buildCpu();
    ComputerBuilder buildDisk();
    ComputerBuilder buildMemory();
    ComputerBuilder buildMainboard();
    ComputerBuilder buildPower();
    Computer createComputer();
}
