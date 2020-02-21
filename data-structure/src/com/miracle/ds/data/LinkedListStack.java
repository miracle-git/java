package com.miracle.ds.data;

public class LinkedListStack<T> implements Stack<T> {

    private LinkedList<T> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(T elem) { list.addFirst(elem); }

    @Override
    public T pop() { return list.removeFirst(); }

    @Override
    public T peek() { return list.getFirst(); }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("LinkedListStack, top: ");
        result.append(list);

        return result.toString();
    }
}