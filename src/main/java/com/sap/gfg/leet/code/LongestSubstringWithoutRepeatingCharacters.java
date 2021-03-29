package com.sap.gfg.leet.code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * Input: s = "abcabcbb"
 * 
 * Output: 3
 * 
 * Explanation: The answer is "abc", with the length of 3.
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		getUniqueCharacterSubstring(s);
		lengthOfLongestSubstring(s);
	}

	public static int lengthOfLongestSubstring(String input) {
		String output = "";
		for (int start = 0; start < input.length(); start++) {
			Set<Character> visited = new HashSet<Character>();
			int end = start;
			for (; end < input.length(); end++) {
				char currChar = input.charAt(end);
				if (visited.contains(currChar)) {
					break;
				} else {
					visited.add(currChar);
				}
			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end);
			}
		}
		return output.length();
	}
	
	public static String getUniqueCharacterSubstring(String input) {
	    Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	    }
	    return output;
	}
}
