package com.miracle.pattern.command;

public class ConditionInvoker {
    private Command  onCommand;
    private Command  offCommand;
    private Command  coolCommand;
    private Command  warmCommand;

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void setCoolCommand(Command coolCommand) {
        this.coolCommand = coolCommand;
    }

    public void setWarmCommand(Command warmCommand) {
        this.warmCommand = warmCommand;
    }

    public void on() {
        this. onCommand.execute();
    }

    public void off() {
        this.offCommand.execute();
    }

    public void cool() {
        this.coolCommand.execute();
    }

    public void warm() {
        this.warmCommand.execute();
    }
}
