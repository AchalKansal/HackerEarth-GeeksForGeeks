package com.learn.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A comparable object is capable of comparing itself with another object. The class itself must
 * implements the java.lang.Comparable interface to compare its instances.
 */
public class CompareObjectUsingComparable implements Comparable<CompareObjectUsingComparable> {

  private String firstName;
  private String lastName;
  private int age;

  public CompareObjectUsingComparable(String firstName, String lastName, int age) {
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
  public int compareTo(CompareObjectUsingComparable obj) {
    if (this.age == obj.age) return 0;
    else if (this.age > obj.age) return 1;
    else return -1;
  }

  public static void main(String[] args) {
    CompareObjectUsingComparable obj1 = new CompareObjectUsingComparable("Achal", "Kansal", 28);
    CompareObjectUsingComparable obj2 = new CompareObjectUsingComparable("Achal1", "Kansal1", 30);
    CompareObjectUsingComparable obj3 = new CompareObjectUsingComparable("Achal2", "Kansal2", 27);
    List<CompareObjectUsingComparable> list1 = new ArrayList<CompareObjectUsingComparable>();
    list1.add(obj1);
    list1.add(obj2);
    list1.add(obj3);

    Collections.sort(list1);
    list1.stream()
        .forEach(
            obj -> {
              System.out.println(obj.firstName);
              System.out.println(obj.lastName);
              System.out.println(obj.age);
            });
  }
}
