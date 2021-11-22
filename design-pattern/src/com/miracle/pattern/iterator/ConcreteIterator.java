package com.miracle.pattern.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private List list;
    private int index = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(index);
            index++;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return this.index != this.list.size();
    }

    @Override
    public Object remove(Object obj) {
        return this.list.remove(obj);
    }
}
