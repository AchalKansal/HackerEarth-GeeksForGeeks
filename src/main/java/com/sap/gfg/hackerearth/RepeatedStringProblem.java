package com.sap.gfg.hackerearth;

import java.util.Scanner;

/**
 * 
 * Lilah has a string s , of lowercase English letters that she repeated
 * infinitely many times.
 * 
 * Given an integer n , find and print the number of letter a's in the first n
 * letters of Lilah's infinite string.
 * 
 * For example, if the string s= "abcac" and n=10, the substring we consider is
 * abcacabcac, the first 10 characters of her infinite string. There are 4
 * occurrences of a in the substring.
 * 
 * Function Description
 * 
 * Complete the repeatedString function in the editor below. It should return an
 * integer representing the number of occurrences of a in the prefix of length
 * in the infinitely repeating string.
 * 
 * repeatedString has the following parameter(s):
 * 
 * s: a string to repeat n: the number of characters to consider Input Format
 * 
 * The first line contains a single string, s. The second line contains an
 * integer, n.
 */
public class RepeatedStringProblem {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		 String s = "aba";
		 long n = 10;
		//String s = scanner.nextLine();

		//long n = scanner.nextLong();
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		// long result = repeatedString(s, n);

		long occur = repeatedString(s, n);
		System.out.println("Occurences of a: " + occur);
	}

	static long repeatedString(String s, long n) {
		char[] chrIn = s.toCharArray();
		int i = 0;
		long max = 0;
		long quo = n / chrIn.length;
		long rem = n % chrIn.length;
		while (i < chrIn.length) {
			if (chrIn[i] == 'a') {
				max++;
			}
			i++;
		}
		i = 0;
		max = max * quo;
		while (i < rem) {
			if (chrIn[i] == 'a') {
				max++;
			}
			i++;

		}
		return max;
	}
	
	static long repeatedStringLong(String s, long n) {
		int numberOfAppendences = 0;
		String newString = "";
		StringBuilder buildString = new StringBuilder();
		System.out.println("Divison: "+Math.round(n / s.length()));
		System.out.println("Mod: "+n % s.length());
		if (s.length() < n) {
			numberOfAppendences = Math.round(n / s.length());
		}
		for (int i = 0; i < numberOfAppendences + 1; i++) {
			buildString.append(s.toString());
		}
		newString = buildString.toString().substring(0, (int) n);
		System.out.println("new string length: "+ newString.length());
		int i = 0;
		for (char charElement : newString.toCharArray()) {
			if(charElement == 'a') {
				i++;
			}
		}
		System.out.println("String: "+newString);
		return i;

	}

}
