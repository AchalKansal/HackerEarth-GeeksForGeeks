package com.sap.gfg.prac;

public class InsertStringInAnotherString {
	public static void main(String[] args) {
		String a = "achalkansal";
		String b = "ak";
		int index = 6;
		String c = "";
		c = a.substring(0, index-1);
		c += b;
		c += a.substring(index-1,a.length());
		System.out.println(c);
	}
}
