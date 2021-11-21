package com.miracle.pattern.client;

import com.miracle.pattern.observer.ConcreteObserver;
import com.miracle.pattern.observer.ConcreteSubject;
import com.miracle.pattern.observer.Observer;
import com.miracle.pattern.observer.Subject;

public class ObserverClient {
    public static void run() {
        Subject subject = new ConcreteSubject();
        Observer miracle = new ConcreteObserver("miracle");
        Observer jack = new ConcreteObserver("jack");

        subject.addObserver(miracle);
        subject.addObserver(jack);

        subject.notifyAllObservers();
    }
}
