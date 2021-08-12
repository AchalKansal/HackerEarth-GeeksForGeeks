package com.learn.concepts.wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
  public static void printData(List<? extends Number> list) {
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

    List<Double> list2 = new ArrayList<Double>();
    list2.add(1.0);
    list2.add(2.0);
    list2.add(3.0);
    list2.add(4.0);
    list2.add(5.0);
    printData ( list2 );
  }
}
