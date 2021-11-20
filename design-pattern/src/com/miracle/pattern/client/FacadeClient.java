package com.miracle.pattern.client;

import com.miracle.pattern.facade.MessageFacade;
import com.miracle.pattern.facade.MessageManager;

public class FacadeClient {
    public static void run() {
        MessageManager message = new MessageFacade();
        message.send();
    }
}
