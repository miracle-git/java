package com.miracle.pattern.client;

import com.miracle.pattern.iterator.Collection;
import com.miracle.pattern.iterator.ConcreteCollection;
import com.miracle.pattern.iterator.Iterator;

public class IteratorClient {
    public static void run() {
        Collection collection = new ConcreteCollection();
        collection.add("miracle");
        collection.add("jack");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
