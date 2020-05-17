package com.sap.gfg.prac;

public class ReplaceAllOccurrencesOfAStringWithSpace {
	public static void main(String[] args) {
		String original = "achalIachalamachalCool";
		String literal = "achal";
		original = original.replaceAll(literal, " ").trim();
		System.out.println(original);
	}
}
