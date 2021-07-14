package com.learn.leet.code.arrays;

/***
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return anything from your function.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 *
 * Note:
 *
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {
    public static void main ( String[] args ) {
        int[] nums = new int[ 8 ];
        nums[ 0 ] = 1;
        nums[ 1 ] = 0;
        nums[ 2 ] = 2;
        nums[ 3 ] = 3;
        nums[ 4 ] = 0;
        nums[ 5 ] = 4;
        nums[ 6 ] = 5;
        nums[ 7 ] = 0;

        duplicateZeros(nums);
    }

	private static int[] duplicateZeros(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				callShift(nums, i);
			}
		}
		return nums;
	}

	private static void callShift(int[] nums, int position) {
		for (int i = nums.length - 1 ; i > position; i--) {
			if(i-1 != position) {
				nums[i] = nums[i-1];
			}
		}
		// this check is necessary as position can exceed the length of the array.
		if(position+1 < nums.length) {
			nums[position+1] = 0;
		}
	}
}
