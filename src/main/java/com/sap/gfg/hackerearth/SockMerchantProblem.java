package com.sap.gfg.hackerearth;

import java.util.HashSet;
import java.util.Set;

/**
 * John works at a clothing store. He has a large pile of socks that he must
 * pair by color for sale. Given an array of integers representing the color of
 * each sock, determine how many pairs of socks with matching colors there are.
 * 
 * For example, there are socks with colors . There is one pair of color and one
 * of color . There are three odd socks left, one of each color. The number of
 * pairs is .
 * 
 * Function Description
 * 
 * Complete the sockMerchant function in the editor below. It must return an
 * integer representing the number of matching pairs of socks that are
 * available.
 * 
 * sockMerchant has the following parameter(s):
 * 
 * n: the number of socks in the pile ar: the colors of each sock Input Format
 * 
 * The first line contains an integer , the number of socks represented in . The
 * second line contains space-separated integers describing the colors of the
 * socks in the pile.
 */


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
			if (!colors.contains(color)) {
				colors.add(color);
			} else {
				colors.remove(color);
				pairs++;
			}
		}

		System.out.println(pairs);
	}
}
