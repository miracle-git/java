package com.miracle.ds.data;

public class LinkedListQueue<T> implements Queue<T> {

    private class Node {
        public T elem;
        public Node next;

        public Node(T elem, Node next) {
            this.elem = elem;
            this.next = next;
        }

        public Node(T elem) {
            this(elem, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return elem.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(T elem) {
        if (tail == null) {
            tail = new Node(elem);
            tail.next = null;
            head = tail;
        } else {
            tail.next = new Node(elem);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }

        Node node = head;
        head = head.next;
        node.next = null;
        if (head == null) {
            tail = null;
        }
        size--;

        return node.elem;
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }

        return head.elem;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        result.append("LinkedListQueue, front [");
        while (current != null) {
            result.append(current + "->");
            current = current.next;
        }
        result.append("NULL] tail");

        return result.toString();
    }
}