package com.sap.gfg.prac;

public class LongestPalendrome {
	public static void main(String[] args) {
		String a = "aaaaabbaaa";
		test(a,0);
	}

	private static String test(String a, int j) {
		String substring = a.substring(1);
		StringBuffer sb = new StringBuffer(substring);
		String reverseString = sb.reverse().toString();
		if(reverseString.equals(substring)) {
			System.out.println(substring);
			return "yes";
		} else {
			for(int i = 1 ; i < a.length() ; i++) {
				String check = test(a,i);
				if (check.equals("yes")) {
					break;
				}
			}
		}
		return null;
	}
}
