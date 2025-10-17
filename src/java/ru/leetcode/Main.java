package ru.leetcode;

public class Main {
	public static void main(String[] args) {
		int[] arr1 = {1, 3,6};
		int[] arr2 = {0, 9, 9, 9, 9, 9};
		int[][] arrOfarr = {arr1, arr2};

		ListNode next = null;
		ListNode curr;
		ListNode[] listNodesArr = new ListNode[arrOfarr.length];

		for (int i = 0; i < arrOfarr.length; i++) {
			for (int j = arrOfarr[i].length - 1; j >= 0; j--) {
				curr = new ListNode(arrOfarr[i][j], next);
				next = curr;
			}
			listNodesArr[i] = next;
			next = null;
		}


		ListNode l1Start = listNodesArr[0];
		ListNode l2Start = listNodesArr[1];
		AddTwoNumbers.addTwoNumbers(l1Start, l2Start);
	}
}