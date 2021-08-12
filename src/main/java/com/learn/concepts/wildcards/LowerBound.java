package com.learn.concepts.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
  public static void printData(List<? extends Integer> list) {
    System.out.println(list);
  }

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    printData(list1);
  }
}
