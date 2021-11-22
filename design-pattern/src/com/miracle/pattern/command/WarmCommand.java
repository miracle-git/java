package com.miracle.pattern.command;

public class WarmCommand implements Command {
    private ConditionReceiver receiver;

    public WarmCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("WarmCommand -> execute");
        this.receiver.warm();
    }
}
