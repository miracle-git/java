package com.miracle.pattern.iterator;

public interface Iterator {
    Object next();
    boolean hasNext();
    Object remove(Object obj);
}
