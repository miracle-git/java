package com.miracle.ds.data;

public class ArrayStack<T> implements Stack<T> {

    private Array<T> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayStack() {
        array = new Array<>();
    }

    public int getCapacity() { return array.getCapacity(); }

    @Override
    public void push(T elem) {
        array.addLast(elem);
    }

    @Override
    public T pop() {
        return array.removeLast();
    }

    @Override
    public T peek() {
        return array.getLast();
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

        result.append("ArrayStack: ");
        result.append("[");
        result.append(array.join());
        result.append("] top");

        return result.toString();
    }
}
