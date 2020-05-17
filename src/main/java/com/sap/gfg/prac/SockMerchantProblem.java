package com.sap.gfg.prac;

import java.util.HashSet;
import java.util.Set;

public class SockMerchantProblem {
	public static void main(String[] args) {
		int arr[] = new int[9];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 20;
		arr[3] = 10;
		arr[4] = 10;
		arr[5] = 30;
		arr[6] = 50;
		arr[7] = 10;
		arr[8] = 20;
		
		
		Set<Integer> colors = new HashSet<>();
	    int pairs = 0;
	    for (Integer color : arr) {
			if(!colors.contains(color)) {
				colors.add(color);
			} else {
				colors.remove(color);
				pairs++;
			}
		}

	    System.out.println(pairs);
	}
}
