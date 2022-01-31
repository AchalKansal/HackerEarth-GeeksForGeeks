package com.learn.concepts.multithreading;

/**
 * Multithreading is a Java feature that allows concurrent execution of two or more parts of a
 * program for maximum utilization of CPU. Each part of such program is called a thread. So, threads
 * are light-weight processes within a process.
 */
public class MultithreadingWithThreadClass extends Thread {
  @Override
  public void run() {
    System.out.println("Thread: " + Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      MultithreadingWithThreadClass mt = new MultithreadingWithThreadClass();
      mt.start();
    }
  }
}
