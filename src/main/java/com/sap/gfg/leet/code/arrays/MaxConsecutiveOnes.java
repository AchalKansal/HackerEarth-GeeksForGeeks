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
        nums[ 1 ] = 1;
        nums[ 2 ] = 0;
        nums[ 3 ] = 1;
        nums[ 4 ] = 1;
        nums[ 5 ] = 1;
        getMaxLength(nums);
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
		if (occurance > temp) {
			temp = occurance;
		}
		return temp;
	}

	// More Compact solution.
    static int getMaxLength(int arr[])
	{

		int count = 0; // intitialize count
		int result = 0; // initialize max

		for (int i = 0; i < arr.length; i++) {

			// Reset count when 0 is found
			if (arr[i] == 0)
				count = 0;

			// If 1 is found, increment count
			// and update result if count becomes
			// more.
			else {
				count++;// increase count
				result = Math.max(result, count);
			}
		}
		return result;
	}
}
