package com.sap.gfg.leet.code.arrays;

/***
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *     The maximum number of consecutive 1s is 3.
 *
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {
    public static void main ( String[] args ) {
        int[] nums = new int[ 6 ];
        nums[ 0 ] = 1;
        nums[ 1 ] = 0;
        nums[ 2 ] = 1;
        nums[ 3 ] = 1;
        nums[ 4 ] = 0;
        nums[ 5 ] = 1;
        findMaxConsecutiveOnes ( nums );
    }

	public static int findMaxConsecutiveOnes(int[] nums) {
		int occurance = 0;
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				occurance++;
			} else {
				if (occurance > temp) {
					temp = occurance;
				}
				occurance = 0;
			}
		}
		return temp;
	}
}
