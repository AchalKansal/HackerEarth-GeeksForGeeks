package com.sap.gfg.leet.code.arrays;

public class RunningSumOf1dArray {
    public static void main ( String[] args ) {
        int[] nums = new int[ 4 ];
        nums[ 0 ] = 1;
        nums[ 1 ] = 2;
        nums[ 2 ] = 3;
        nums[ 3 ] = 4;

        int[] answerArray = sumOfArray ( nums );
        for ( int i = 0; i < answerArray.length; i++ ) {
            System.out.println ( answerArray[ i ] + " " );
        }
    }

    public static int[] sumOfArray ( int[] nums ) {
        int[] newArray = new int[ nums.length ];
        int sum;
        for ( int i = 0; i < nums.length; i++ ) {
            sum = 0;
            for ( int j = 0; j <= i; j++ ) {
                sum += nums[ j ];
            }
            newArray[ i ] = sum;
        }
        return newArray;
    }
}
