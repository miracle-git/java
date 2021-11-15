package com.miracle.pattern.builder;

public class LowerComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public ComputerBuilder buildCpu() {
        computer.setCpu("低配 CPU");
        return this;
    }

    @Override
    public ComputerBuilder buildDisk() {
        computer.setDisk("低配 磁盘");
        return this;
    }

    @Override
    public ComputerBuilder buildMemory() {
        computer.setMemory("低配 内存");
        return this;
    }

    @Override
    public ComputerBuilder buildMainboard() {
        computer.setMainboard("低配 主板");
        return this;
    }

    @Override
    public ComputerBuilder buildPower() {
        computer.setPower("低配 电源");
        return this;
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
