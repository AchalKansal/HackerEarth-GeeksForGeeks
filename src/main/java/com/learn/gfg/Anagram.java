package com.learn.gfg;

import java.util.HashMap;

//public class Anagram {
//	public static void main(String[] args) {
//		String a = "test123";
//		String b = "132sett";
//		char[] c = a.toCharArray();
//		char[] d = b.toCharArray();
//		Arrays.sort(c);
//		Arrays.sort(d);
//		System.out.println(Arrays.equals(c, d));
//	}
//}


//Java code to check whether two strings 
//are Anagram or not using HashMap 


class Anagram {

    private static int CHARACTER_RANGE = 256;

    // Function to check whether two strings
    // are an anagram of each other
    static boolean areAnagram ( String str1, String str2 ) {

        HashMap<Character, Integer> hmap1
                = new HashMap<Character, Integer> ();
        HashMap<Character, Integer> hmap2
                = new HashMap<Character, Integer> ();

        char arr1[] = str1.toCharArray ();
        char arr2[] = str2.toCharArray ();

        // Mapping first string
        for ( int i = 0; i < arr1.length; i++ ) {

            if (hmap1.get ( arr1[ i ] ) == null) {

                hmap1.put ( arr1[ i ], 1 );
            } else {
                Integer c = (int) hmap1.get ( arr1[ i ] );
                hmap1.put ( arr1[ i ], ++c );
            }
        }

        // Mapping second String
        for ( int j = 0; j < arr2.length; j++ ) {

            if (hmap2.get ( arr2[ j ] ) == null)
                hmap2.put ( arr2[ j ], 1 );
            else {

                Integer d = (int) hmap2.get ( arr2[ j ] );
                hmap2.put ( arr2[ j ], ++d );
            }
        }

        if (hmap1.equals ( hmap2 ))
            return true;
        else
            return false;
    }

    public static boolean isAnagramCounting ( String string1, String string2 ) {
        if (string1.length () != string2.length ()) {
            return false;
        }
        int count[] = new int[ CHARACTER_RANGE ];
        for ( int i = 0; i < string1.length (); i++ ) {
            count[ string1.charAt ( i ) ]++;
            count[ string2.charAt ( i ) ]--;
        }
        for ( int i = 0; i < CHARACTER_RANGE; i++ ) {
            if (count[ i ] != 0) {
                return false;
            }
        }
        return true;
    }

    // Test function
    public static void test ( String str1, String str2 ) {

        System.out.println ( "Strings to be checked are:\n"
                + str1 + "\n" + str2 + "\n" );

        // Find the result
        if (areAnagram ( str1, str2 ))
            System.out.println ( "The two strings are "
                    + "anagrams of each other\n" );
        else
            System.out.println ( "The two strings are not"
                    + " anagrams of each other\n" );
    }

    // Driver program
    public static void main ( String args[] ) {

        // Get the Strings
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";

        // Test the Strings
        //test(str1, str2);

		isAnagramCounting ( str1, str2 );
        // Get the Strings
        str1 = "geeksforgeeks";
        str2 = "geeks";


        // Test the Strings
        test ( str1, str2 );
    }
} 

