package com.miracle.pattern.builder;

public class HigherComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public ComputerBuilder buildCpu() {
        computer.setCpu("高配 CPU");
        return this;
    }

    @Override
    public ComputerBuilder buildDisk() {
        computer.setDisk("高配 磁盘");
        return this;
    }

    @Override
    public ComputerBuilder buildMemory() {
        computer.setMemory("高配 内存");
        return this;
    }

    @Override
    public ComputerBuilder buildMainboard() {
        computer.setMainboard("高配 主板");
        return this;
    }

    @Override
    public ComputerBuilder buildPower() {
        computer.setPower("高配 电源");
        return this;
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
