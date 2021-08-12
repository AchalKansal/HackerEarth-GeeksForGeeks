package com.learn.concepts.cloning;

public class CloningBlocked {
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

    public CloningBlocked(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public Object clone() throws  CloneNotSupportedException{
        throw new CloneNotSupportedException ("Cloning not supported");
    }

    public static void main(String[] args) {
        CloningBlocked dc = new CloningBlocked("Achal", "Kansal", 28);
        CloningBlocked dc1 = null;
        try{
            dc1 = (CloningBlocked) dc.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace ();
        }

        System.out.println("Object 2: " + dc1.getAge());
        System.out.println("Object 2: " + dc1.getFirstName());
        System.out.println("Object 2: " + dc1.getLastName());
        System.out.println("Updating the value of the shallow object 2");
        dc1.setAge(11);
        System.out.println(
                "After updating the value of the object 2 it reflects the object 1 as well. It shows the objects are disjoint");
        System.out.println("Object 2: " + dc1.getAge());
        System.out.println("Object 1: " + dc.getAge());
    }
}
