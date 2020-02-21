package com.miracle.ds.data;

public interface Queue<T> {
    void enqueue(T elem);

    T dequeue();

    T front();

    int getSize();

    boolean isEmpty();
}