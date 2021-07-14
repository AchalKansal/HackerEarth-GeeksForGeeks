package com.learn.gfg;

public class RemoveNonAlphbeticalFromString {
	public static void main(String[] args) {
		String  a = "i am achal";
		String delims = "\\W+"; // split any non word 
		String[] token = a.split(delims);
		for (String stringTokenizer : token) {
			System.out.println(stringTokenizer);
		}
	}
}
