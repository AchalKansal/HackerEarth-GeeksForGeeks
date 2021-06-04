package com.sap.gfg.codesignal;

public class ShapeArea {

    public static void main ( String[] args ) {

        System.out.println ( shapeArea ( 3 ) );
    }

    public static int shapeArea ( int n ) {

        if (n==1 ){
            return 1;
        } else {
            return ((n*n)+((n-1)*(n-1)));
        }

    }



}


// sum = sum + n(1) + 0;
// n = 4
// n*2 -1 --> center line
// ( n -1 ) * 2 --> recursive until 1