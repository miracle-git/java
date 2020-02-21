package com.miracle.ds.data;

public class ArrayQueue<T> implements Queue<T> {

    private Array<T> array;

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
        array = new Array<>();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void enqueue(T elem) { array.addLast(elem); }

    @Override
    public T dequeue() {
        return array.removeFirst();
    }

    @Override
    public T front() {
        return array.getFirst();
    }

    @Override
    public int getSize() { return array.getSize(); }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("ArrayQueue: ");
        result.append("front [");
        result.append(array.join());
        result.append("] tail");

        return result.toString();
    }
}
