package com.miracle.pattern.command;

public class CoolCommand implements Command {
    private ConditionReceiver receiver;

    public CoolCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("CoolCommand -> execute");
        this.receiver.cool();
    }
}
