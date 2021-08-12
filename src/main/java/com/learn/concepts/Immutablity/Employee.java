package com.learn.concepts.Immutablity;

import java.io.Serializable;

/**
 * The class must be declared as final (So that child classes can’t be created)
 *
 * <p>Data members in the class must be declared as private (So that direct access is not allowed)
 *
 * <p>Data members in the class must be declared as final (So that we can’t change the value of it
 * after object creation)
 *
 * <p>A parameterized constructor should initialize all the fields performing a deep copy (So that
 * data members can’t be modified with object reference)
 *
 * <p>Deep Copy of objects should be performed in the getter methods (To return a copy rather than
 * returning the actual object reference)
 *
 * <p>No setters (To not have the option to change the value of the instance variable)
 */
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
    System.out.println(emp.getFirstName());
  }
}
