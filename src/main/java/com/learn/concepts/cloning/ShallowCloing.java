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

  public static void main(String[] args) throws CloneNotSupportedException {
      ShallowCloing sc = new ShallowCloing ( "Achal", "Kansal",28 );
      ShallowCloing sc1 = sc;
      System.out.println ("Object 2: "+sc1.getAge ());
      System.out.println ("Object 2: "+sc1.getFirstName ());
      System.out.println ("Object 2: "+sc1.getLastName ());
      System.out.println ("Updating the value of the shallow object 2");
      sc1.setAge (11);
      System.out.println ("Object 2: "+sc1.getAge ());
      System.out.println ("Object 1: "+sc.getAge ());
  }
}
