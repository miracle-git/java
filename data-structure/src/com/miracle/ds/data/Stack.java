package com.miracle.ds.data;

public interface Stack<T> {
    void push(T elem);

    T pop();

    T peek();

    int getSize();

    boolean isEmpty();
}