package com.learn.gfg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountNumberOfOccuranceInSetOfString {
	public static void main(String[] args) {
		Set<String> strings = new HashSet<>();
		strings.add("achal");
		strings.add("kansal");
		strings.add("achal");
		strings.add("whiterosee");
		HashMap<String,Integer> count = new HashMap<>();
		strings.stream().forEach(str -> {
			if(null == count.get(str)) {
				count.put(str, 1);
			} else {
				int val = count.get(str);
				count.replace(str, val+1);
			}
		});
		System.out.println(count.toString());
	}
}
