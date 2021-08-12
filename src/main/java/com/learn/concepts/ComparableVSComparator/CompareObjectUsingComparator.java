package com.learn.concepts.ComparableVSComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareObjectUsingComparator implements Comparator<CompareObjectUsingComparator> {
  private String firstName;
  private String lastName;
  private int age;

  public CompareObjectUsingComparator(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public int compare(CompareObjectUsingComparator obj1, CompareObjectUsingComparator obj2) {
    if (obj1.age == obj2.age) return 0;
    else if (obj1.age > obj2.age) return 1;
    else return -1;
  }

  public static void main(String[] args) {
    CompareObjectUsingComparator obj1 = new CompareObjectUsingComparator("Achal", "Kansal", 28);
    CompareObjectUsingComparator obj2 = new CompareObjectUsingComparator("Achal1", "Kansal1", 30);
    CompareObjectUsingComparator obj3 = new CompareObjectUsingComparator("Achal2", "Kansal2", 27);
    CompareObjectUsingComparator obj4 = new CompareObjectUsingComparator("AchalTest", "Kansal2", 0);
    List<CompareObjectUsingComparator> list1 = new ArrayList<CompareObjectUsingComparator>();
    list1.add(obj1);
    list1.add(obj2);
    list1.add(obj3);

    Collections.sort(list1, obj2);

    list1.stream()
        .forEach(
            obj -> {
              System.out.println(obj.firstName);
              System.out.println(obj.lastName);
              System.out.println(obj.age);
            });

    list1.add(obj4);

    Collections.sort(
        list1,
        new Comparator<CompareObjectUsingComparator>() {
          @Override
          public int compare(CompareObjectUsingComparator o1, CompareObjectUsingComparator o2) {
            return o1.age - o2.age;
          }
        });

    list1.stream()
        .forEach(
            obj -> {
              System.out.println(obj.firstName);
              System.out.println(obj.lastName);
              System.out.println(obj.age);
            });
  }
}
