package com.miracle.ds;

import com.miracle.ds.test.*;

public class Main {

  public static void main(String[] args) {
    ArrayTest.run();
    LinkedListTest.run();

    ArrayStackTest.run();
    LinkedListStackTest.run();
    StackTest.run(10000);
    StackTest.run(1000000);

    ArrayQueueTest.run();
    LoopQueueTest.run();
    LinkedListQueueTest.run();
    QueueTest.run(10000);
    QueueTest.run(100000);
  }
}