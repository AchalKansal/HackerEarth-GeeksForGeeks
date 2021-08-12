package com.learn.concepts.cloning;

public class DeepCloning implements Cloneable{
    private String firstName;
    private String lastName;
    private int age;

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

    public DeepCloning ( String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone ();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloning dc = new DeepCloning ( "Achal", "Kansal",28 );
        DeepCloning dc1 = (DeepCloning) dc.clone();
        System.out.println ("Object 2: "+dc1.getAge ());
        System.out.println ("Object 2: "+dc1.getFirstName ());
        System.out.println ("Object 2: "+dc1.getLastName ());
        System.out.println ("Updating the value of the shallow object 2");
        dc1.setAge (11);
        System.out.println ("Object 2: "+dc1.getAge ());
        System.out.println ("Object 1: "+dc.getAge ());
    }
}
