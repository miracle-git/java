package com.miracle.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements Collection {
    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        this.list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        this.list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
