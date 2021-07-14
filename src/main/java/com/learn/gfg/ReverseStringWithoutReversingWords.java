package com.learn.gfg;

public class ReverseStringWithoutReversingWords {
	public static void main(String[] args) {
		String a = "Reverse.String.Without.Reversing.Words.And.Separated.By.Dots";
		StringMetond(a);
	}

	private static void StringMetond(String a) {
		String[] arr = a.split("\\.");
		String finalString = "";
		for (int i = arr.length - 1; i > 0; i--) {
			if (i != 0) {
				finalString += arr[i] + ".";
			} else
				finalString += arr[i];
		}
		System.out.println(finalString);
	}

}
