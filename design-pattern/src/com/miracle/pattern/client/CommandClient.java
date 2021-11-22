package com.miracle.pattern.client;

import com.miracle.pattern.command.*;

public class CommandClient {
    public static void run() {
        ConditionReceiver receiver = new ConditionReceiver();

        Command onCommand = new OnCommand(receiver);
        Command offCommand = new OffCommand(receiver);
        Command coolCommand = new CoolCommand(receiver);
        Command warmCommand = new WarmCommand(receiver);

        ConditionInvoker invoker = new ConditionInvoker();
        invoker.setOnCommand(onCommand);
        invoker.setOffCommand(offCommand);
        invoker.setCoolCommand(coolCommand);
        invoker.setWarmCommand(warmCommand);

        invoker.on();
        invoker.cool();
        invoker.warm();
        invoker.off();
    }
}
