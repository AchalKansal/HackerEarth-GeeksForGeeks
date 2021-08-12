package com.learn.concepts.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * We use the Lower Bounded wildcards to widen the use of the type of variable.
 * For example, if we want to add the list of integers in our method we can use the List<Integer>,
 * but using this we will be bound to use only the list of integers.
 */
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
