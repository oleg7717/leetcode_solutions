package ru.leetcode;

public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		boolean carry = true, first = true;
		ListNode curr, prev = null, firstNode = null;
		int sum;
		while (l1 != null && l2 != null || carry) {
			int carryInt = carry && !first ? 1 : 0;
			if (l1 != null && l2 != null) {
				sum = l1.val + l2.val + carryInt;
			} else {
				if (l1 == null && l2 == null) {
					sum  = carryInt;
				} else if (l1 == null) {
					sum = l2.val + carryInt;
				} else {
					sum = l1.val + carryInt;
				}
			}
			carry = sum >= 10;
			curr = new ListNode(sum - 10 * (carry ? 1 : 0));
			if (first) {
				firstNode = curr;
				first = false;
			} else {
				prev.next = curr;
			}
			prev = curr;

			l1 = l1 != null && l1.next != null ? l1.next : null;
			l2 = l2 != null && l2.next != null ? l2.next : null;
			if (!carry) {
				if (l1 == null && l2 != null) curr.next = l2;
				else if (l2 == null && l1 != null) curr.next = l1;
			}
		}

		return firstNode;
	}
}
