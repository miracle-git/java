package com.miracle.ds.data;

public class LinkedList<T> {

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

    private Node dummyHead; // 虚拟头节点
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    // 返回链表中的元素个数
    public int getSize() {
        return size;
    }

    // 判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 往链表头部添加一个元素elem
    public void addFirst(T elem) {
        add(elem, 0);
    }

    // 往链表末尾添加一个元素elem
    public void addLast(T elem) {
        add(elem, size);
    }

    // 往链表的指定位置index添加一个元素elem
    public void add(T elem, int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        // Node node = new Node(elem);
        // node.next = prev.next;
        // prev.next = node;
        prev.next = new Node(elem, prev.next);
        size++;
    }

    // 删除链表的头部元素
    public T removeFirst() {
        return remove(0);
    }

    // 删除链表的末尾元素
    public T removeLast() {
        return remove(size - 1);
    }

    // 删除链表中指定位置index的元素
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Require index >= 0 and index < size.");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node result = prev.next;
        prev.next = result.next;
        result.next = null;
        size--;

        return result.elem;
    }

    // 获取链表的头部元素
    public T getFirst() {
        return get(0);
    }

    // 获取链表的末尾元素
    public T getLast() {
        return get(size - 1);
    }

    // 获取链表的指定位置index的元素
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Require index >= 0 and index < size.");
        }

        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.elem;
    }

    // 修改指定索引index位置的元素
    public void set(int index, T val) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Require index >= 0 and index < size.");
        }

        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.elem = val;
    }

    // 查找链表是否包含元素elem
    public boolean contains(T elem) {
        Node current = dummyHead.next;

        while (current != null) {
            if (current.elem.equals((elem))) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = dummyHead.next;

        while (current != null) {
            result.append(current + "->");
            current = current.next;
        }
        result.append("NULL");

        return result.toString();
    }
}