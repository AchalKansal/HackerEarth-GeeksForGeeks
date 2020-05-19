package com.sap.gfg.hackerearth.array;

public class LeftRotation {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int numberOfRotations = 2;
		System.out.println(rotLeft(a, numberOfRotations));
	}

	static int[] rotLeft(int[] a, int d) {
		int size = a.length;
		int count = 0;
		int[] temp = new int[size];
		for (int i = d, j = 0; i < a.length; i++, j++) {
			temp[j] = a[i];
			count++;
		}
		for (int i = 0, j = count; i < d; i++,j++) {
			temp[j] = a[i];
		}
		return a;
	}
}
