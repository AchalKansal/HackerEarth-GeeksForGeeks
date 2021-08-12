package com.learn.concepts.stream.SerializationAndDeserialization;

import java.io.*;
import java.util.Base64;

/**
 * The serialVersionUID attribute is an identifier
 * that is used to serialize/deserialize
 * an object of a Serializable class.
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 12345L;
    private String firstName;
    private String LastName;
    private int age;

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return LastName;
    }

    public void setLastName ( String lastName ) {
        LastName = lastName;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public Employee ( String firstName, String lastName, int age ) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public static void main ( String[] args ) {
        Employee emp = new Employee ( "Achal", "Kansal", 28 );
        String serializeObj = serialize ( emp );
        System.out.println ( serializeObj );
        deserialize ( serializeObj );
        // Below method will throw error.
        // deserialize ( new Employee("123","123",0).toString ());
    }

    private static void deserialize ( String serializeObj ) {
        byte[] data = Base64.getDecoder ().decode ( serializeObj );
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream (
                    new ByteArrayInputStream ( data ) );
            Object o = ois.readObject ();
            Employee emp = (Employee) o;
            System.out.println (emp.getAge ());
            System.out.println (emp.getFirstName ());
            System.out.println (emp.getLastName ());
            ois.close ();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace ();
        }
    }

    private static String serialize ( Serializable emp ) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream ();
            ObjectOutputStream oos = new ObjectOutputStream ( bos );
            oos.writeObject ( emp );
            oos.close ();
            return Base64.getEncoder ().encodeToString ( bos.toByteArray () );
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return "";
    }
}
