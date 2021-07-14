package com.learn.gfg;

public class MoveSpecialCharAtEndOfString {
	public static void main(String[] args) {
		String str =  "qwerty*qwerty";
		String finalStr1 = "";
		String finalStr2 = "";
		String regx = "[a-zA-Z0-9\\s+]"; 
		for(int i=0 ; i<str.length();i++) {
			if(String.valueOf(str.charAt(i)).matches(regx)) {
				finalStr1 +=  String.valueOf(str.charAt(i));
			} else {
				finalStr2 +=  String.valueOf(str.charAt(i));
			}
		}
		finalStr1 += finalStr2;
		System.out.println(finalStr1);
	}
}
