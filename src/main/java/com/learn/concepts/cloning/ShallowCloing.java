package com.learn.concepts.cloning;

public class ShallowCloing {
  private String firstName;
  private String LastName;
  private int age;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public ShallowCloing(String firstName, String lastName, int age) {
    this.firstName = firstName;
    LastName = lastName;
    this.age = age;
  }
}
