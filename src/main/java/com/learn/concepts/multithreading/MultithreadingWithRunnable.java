package com.learn.concepts.multithreading;

public class MultithreadingWithRunnable implements Runnable {

  @Override
  public void run() {
      System.out.println ("Thread: "+Thread.currentThread ().getId ());
  }

  public static void main(String[] args) {
    MultithreadingWithRunnable mt = new MultithreadingWithRunnable();
    mt.run();
  }
}
