package com.miracle.ds.data;

public class Array<T> {

  private T[] data;
  private int size;

  // 构造函数，初始化数组容量
  public Array(int capacity) {
    data = (T[]) new Object[capacity];
    size = 0;
  }

  // 默认无参构造函数，默认容量为10
  public Array() {
    this(10);
  }

  // 返回数组的元素个数
  public int getSize() {
    return size;
  }

  // 返回数组的容量
  public int getCapacity() { return data.length; }

  // 判断数组是否为空
  public boolean isEmpty() {
    return size == 0;
  }

  // 往所有元素之前添加一个元素elem
  public void addFirst(T elem) {
    add(elem, 0);
  }

  // 往所有元素之后添加一个元素elem
  public void addLast(T elem) {
    add(elem, size);
  }

  // 往数组指定位置index添加一个元素elem
  public void add(T elem, int index) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
    }

    if (size == data.length) {
      resize(2 * data.length);
    }

    for (int i = size - 1; i >= index; i--) {
      data[i + 1] = data[i];
    }

    data[index] = elem;
    size++;
  }

  // 删除数组中的第一个元素，并返回被删除的元素
  public T removeFirst() {
    return remove(0);
  }

  // 删除数组中的最后一个元素，并返回被删除的元素
  public T removeLast() {
    return remove(size - 1);
  }

  // 删除数组中的指定的元素(仅删除第一个)
  public void removeElement(T elem) {
    int index = find(elem);
    if (index != -1) {
      remove(index);
    }
  }

  // 删除指定索引位置的元素，并返回被删除的元素
  public T remove(int index) {
    if (index < 0 || index >= size) {
      throw new IllegalArgumentException("Remove failed. Require index >= 0 and index < size.");
    }

    T result = data[index];

    for (int i = index + 1; i < size; i++) {
      data[i - 1] = data[i];
    }
    size--;
    data[size] = null;

    if (size == data.length / 4 && data.length / 2 != 0) {
      resize(data.length / 2);
    }

    return result;
  }

  // 获取数组的第一个元素
  public T getFirst() {
    return get(0);
  }

  // 获取数组的最后一个元素
  public T getLast() {
    return get(size - 1);
  }

  // 获取指定索引index位置的元素
  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IllegalArgumentException("Get failed. Require index >= 0 and index < size.");
    }

    return data[index];
  }

  // 修改指定索引index位置的元素
  public void set(int index, T val) {
    if (index < 0 || index >= size) {
      throw new IllegalArgumentException("Set failed. Require index >= 0 and index < size.");
    }

    data[index] = val;
  }

  // 查找数组中是否包含指定的元素
  public boolean contains(T elem) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(elem)) {
        return true;
      }
    }

    return false;
  }

  // 从数组中查找指定元素对应的索引，如未找到则返回-1
  public int find(T elem) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(elem)) {
        return i;
      }
    }

    return -1;
  }

  // 将数组元素以字符串形式拼接起来(以逗号分开)
  public String join() {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < getSize(); i++) {
      result.append(get(i));
      if (i != getSize() - 1) {
        result.append(", ");
      }
    }

    return result.toString();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    result.append(String.format("Array: size = %d, capacity = %d\n", size, getCapacity()));
    result.append("[");
    result.append(join());
    result.append("]");

    return result.toString();
  }

  // 当数组元素插入或删除时，动态扩展或收缩数组的容量
  private void resize(int newCapacity) {
    T[] newData = (T[]) new Object[newCapacity];

    for (int i = 0; i < size; i++) {
      newData[i] = data[i];
    }

    data = newData;
  }
}
