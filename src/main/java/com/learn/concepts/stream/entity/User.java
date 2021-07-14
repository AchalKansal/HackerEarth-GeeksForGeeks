package com.learn.concepts.stream.entity;

public class User {

    private String name;
    private int age;
    private String Address;

    public User ( String name, int age, String address ) {
        this.name = name;
        this.age = age;
        Address = address;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getAddress () {
        return Address;
    }

    public void setAddress ( String address ) {
        Address = address;
    }
}
