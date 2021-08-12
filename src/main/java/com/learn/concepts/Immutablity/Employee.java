package com.learn.concepts.Immutablity;

import java.io.Serializable;

public final class Employee implements Serializable {

  private static final long serialVersionUID = 12345L;
  private final String firstName;
  private final String lastName;
  private final int age;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public Employee(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public static void main(String[] args) {
    Employee emp = new Employee("Achal", "Kansal", 28);
    System.out.println(emp.getFirstName ());
    emp = new Employee("test", "test", 0000);
  }
}
