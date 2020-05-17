package com.sap.gfg.prac;

public class CheckIfStringStartsWithAnyOfTheGivenPrefixes {
	public static void main(String[] args) {
		String a = "Geeksforgeeks";
		String[] arr = { "Geeks", "for", "Gfor" };
		for (String string : arr) {
			if(a.startsWith(string)) {
				System.out.println("true");
			}
		}
	}
}
