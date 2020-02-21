package com.miracle.ds.data;

public class LoopQueue<T> implements Queue<T> {

    private T[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity) {
        data = (T[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
        return data.length - 1;
    }

    @Override
    public void enqueue(T elem) {
        if (isFull()) {
            resize(getCapacity() * 2);
        }
        data[tail] = elem;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }

        T result = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }

        return result;
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }

        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    public boolean isFull() {
        return front == (tail + 1) % data.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(String.format("LoopQueue: size = %d, capacity = %d\n", size, getCapacity()));
        result.append("front [");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            result.append(data[i]);
            if ((i + 1) % data.length != tail) {
                result.append(", ");
            }
        }
        result.append("] tail");

        return result.toString();
    }

    private void resize(int newCapacity) {
        T[] newData = (T[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }

        data = newData;
        front = 0;
        tail = size;
    }
}
