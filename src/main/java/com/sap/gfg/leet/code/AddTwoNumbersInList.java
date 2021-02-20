package com.sap.gfg.leet.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself
 * 
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * 
 * Output: [7,0,8]
 * 
 * Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbersInList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1,null);
		ListNode l2 = new ListNode(2, l1);
		ListNode l3 = new ListNode(3, l2);
		
		ListNode l4 = new ListNode(1,null);
		ListNode l5 = new ListNode(2, l4);
		ListNode l6 = new ListNode(3, l5);
		
		addTwoNumbers(l3,l6);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;

	}
}
