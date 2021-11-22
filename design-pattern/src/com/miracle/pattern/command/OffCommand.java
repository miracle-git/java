package com.miracle.pattern.command;

public class OffCommand implements Command {
    private ConditionReceiver receiver;

    public OffCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("OffCommand -> execute");
        this.receiver.off();
    }
}
