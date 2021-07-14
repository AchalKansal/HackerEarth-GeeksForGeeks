package com.learn.leet.code;

import java.util.Arrays;

/**
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 * 
 * Follow up: The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,3], nums2 = [2]
 * 
 * Output: 2.00000
 * 
 * Explanation: merged array = [1,2,3] and median is 2.
 */
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = new int[2];
		int[] nums2 = new int[2];
		nums1[0] = 1;
		nums1[1] = 2;
		nums2[0] = 3;
		nums2[1] = 4;
		findMedianSortedArrays(nums1, nums2);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int length = nums1.length + nums2.length;
		int[] nums3 = new int[length];
		int oddLength = (int) (Math.floor(nums3.length + 1) / 2);
		int evenLength = (int) (Math.floor(nums3.length) / 2);
		double value = 0;

		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i];
		}
		for (int i = nums1.length - 1, j = 0; i < nums3.length - 1; i++, j++) {
			nums3[i + 1] = nums2[j];
		}

		Arrays.sort(nums3);
		if (nums3.length % 2 == 0) {
			value = nums3[evenLength];
		} else {
			value = nums3[oddLength];
		}
		return value;
	}
	
	
	/***
	 * public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
	 */
}
