package com.learn.gfg;

public class RemoveAWordFromString {
	public static void main(String[] args) {
		String a = "geeks for geeks";
		String b = "for";
		if(a.contains(b)) {
			a = a.replaceAll(b, "");
		}
		System.out.println(a);
	}
}
