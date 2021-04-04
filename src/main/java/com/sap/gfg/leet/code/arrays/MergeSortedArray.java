package com.sap.gfg.leet.code.arrays;

/***
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 *
 *
 * Constraints:
 *
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[i] <= 109
 */
public class MergeSortedArray {
    public static void main ( String[] args ) {
        int[] nums = new int[ 6 ];
        nums[ 0 ] = 1;
        nums[ 1 ] = 2;
        nums[ 2 ] = 3;
        nums[ 3 ] = 0;
        nums[ 4 ] = 0;
        nums[ 5 ] = 0;

        int[] nums2 = new int[ 3 ];
        nums2[ 0 ] = 2;
        nums2[ 1 ] = 5;
        nums2[ 2 ] = 6;

        int m = 3;
        int n = 3;
        merge ( nums , m , nums2 , n );
    }

	public static void merge(int[] nums, int m, int[] nums2, int n) {
		int a = m - 1;
		int b = n - 1;
		int c = m + n - 1;
		while (b >= 0 && a >= 0) {
			if (nums[a] >= nums2[b]) {
				nums[c--] = nums[a--];
			} else {
				nums[c--] = nums2[b--];
			}
		}

		while (b >= 0) {
			nums[c--] = nums2[b--];
		}
	}

}
