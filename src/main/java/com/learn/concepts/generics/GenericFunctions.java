package com.learn.concepts.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericFunctions {

  public static <T> void printData(T obj) {
    System.out.println("Data is :" + obj.getClass().getName() + " " + obj);
  }

  public static void main(String[] args) {
    printData("Achal Kansal");
    printData(28);

    List<String> list = new ArrayList<String>();
    list.add("Test");
    list.add("List");
    list.add("Data");
    printData(list);
    printData(list.get(0));

    /*
    Output:
    Data is :java.lang.String Achal Kansal
    Data is :java.lang.Integer 28
    Data is :java.util.ArrayList [Test, List, Data]
    Data is :java.lang.String Test
     */
  }
}
