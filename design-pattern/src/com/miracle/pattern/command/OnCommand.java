package com.miracle.pattern.command;

public class OnCommand implements Command {
    private ConditionReceiver receiver;

    public OnCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("OnCommand -> execute");
        this.receiver.on();
    }
}
