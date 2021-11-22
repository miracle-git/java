package com.miracle.pattern.iterator;

public interface Collection {
    void add(Object obj);
    void remove(Object obj);
    Iterator iterator();
}
