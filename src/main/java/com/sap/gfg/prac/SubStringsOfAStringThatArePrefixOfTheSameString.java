package com.sap.gfg.prac;

public class SubStringsOfAStringThatArePrefixOfTheSameString {
	public static void main(String[] args) {
		String original = "ababc";
		int n = original.length();
		System.out.println(countSubStrings(original, n));

	}

	public static int subStringsStartingHere(String str, int n, int startIndex) {
		int count = 0, i = startIndex + 1;
		while (i <= n) {
			if (str.startsWith(str.substring(startIndex, i))) {
				count++;
			} else
				break;
			i++;
		}

		return count;
	}

	// Function to return the count of all possible sub-strings
	// of str that are also the prefixes of str
	public static int countSubStrings(String str, int n) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			// If current character is equal to
			// the starting character of str
			if (str.charAt(i) == str.charAt(0))
				count += subStringsStartingHere(str, n, i);
		}

		return count;
	}
}
