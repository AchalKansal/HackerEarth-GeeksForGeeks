package com.learn.concepts.stream;

import com.learn.concepts.stream.entity.User;

import java.util.ArrayList;
import java.util.List;

public class ParallelReduction {

    public static void main ( String[] args ) {

        calculateSumOfListElements ();
        concatenateListOfElements ();
        calculateSumAgeOfUser ();

    }

    private static void calculateSumAgeOfUser () {
        List<User> list = new ArrayList<> ();
        list.add ( new User ( "Achal", 27, "123" ) );
        list.add ( new User ( "Kansal", 28, "123" ) );

        int totalAge = list.parallelStream ().reduce ( 0, ( previous, user ) -> previous + user.getAge (), Integer::sum );
        System.out.println ( "Age sum: " + totalAge );
    }

    private static void concatenateListOfElements () {
        List<String> list = new ArrayList<String> ();
        list.add ( "A" );
        list.add ( "C" );
        list.add ( "H" );
        list.add ( "A" );
        list.add ( "L" );

        String str = list.parallelStream ().reduce ( "", ( previous, next ) -> previous + next );
        System.out.println ( "Final String: " + str );
    }

    private static void calculateSumOfListElements () {
        /**
         * The reduce operation in this example takes two arguments:
         *
         * identity: The identity element is both the initial value of the reduction and the default result if there are
         * no elements in the stream. In this example, the identity element is 0; this is the initial value of the sum
         * of ages and the default value if no members exist in the collection roster.
         *
         * accumulator: The accumulator function takes two parameters: a partial result of the reduction (in this
         * example, the sum of all processed integers so far) and the next element of the stream (in this
         * example, an integer).
         * It returns a new partial result. In this example, the accumulator function is a lambda expression that adds
         * two Integer values and returns an Integer value:
         *
         * (a, b) -> a + b
         * The reduce operation always returns a new value. However, the accumulator function also returns a new value
         * every time it processes an element of a stream. Suppose that you want to reduce the elements of a stream to
         * a more complex object, such as a collection. This might hinder the performance of your application.
         * If your reduce operation involves adding elements to a collection, then every time your accumulator function
         * processes an element, it creates a new collection that includes the element, which is inefficient.
         * It would be more efficient for you to update an existing collection instead.
         *
         */
        List<Integer> list = new ArrayList<Integer> ();
        list.add ( 1 );
        list.add ( 5 );
        list.add ( 11 );
        list.add ( 16 );
        list.add ( 100 );
        list.add ( 0 );

        int sum = list.parallelStream ().reduce ( 0, ( subtotal, element ) -> subtotal + element );
        System.out.println ( "Total sum: " + sum );
    }
}

