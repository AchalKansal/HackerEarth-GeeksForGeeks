package com.learn.leet.code;

/**
 * 
 * 
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
 * 
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] num = new int[4];
		num[0] = 2;
		num[1] = 7;
		num[2] = 11;
		num[3] = 15;
		int target = 9;
		System.out.println(twoSum(num, target));
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] sum = null;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target == nums[i] + nums[j]) {
					sum = new int[2];
					sum[0] = i;
					sum[1] = j;
					return sum;
				}
			}
		}
		return sum;

	}
}
