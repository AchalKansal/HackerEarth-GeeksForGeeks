package com.learn.concepts.multithreading;

public class StartSameThreadMultipleTimes extends Thread {
  @Override
  public void run() {
    System.out.println("Thread: " + Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      StartSameThreadMultipleTimes mt = new StartSameThreadMultipleTimes();
      mt.start();
      mt.start();
      mt.start();
      /*
      This will throw an error of "Exception in thread "main" java.lang.IllegalThreadStateException"
      which means that one thread cannot be started again and again.
       */
    }
  }
}
