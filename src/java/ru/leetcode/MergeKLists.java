package ru.leetcode;

public class MergeKLists {
	public static ListNode mergeKLists(ListNode[] lists) {
		Object[] tmpMap = new Object[20000];
		ListNode prev = null;
		for (ListNode k : lists) {
			while (k != null){
				int intValue = k.val + 10000;
				if (tmpMap[intValue] != null) {
					ListNode[] node = (ListNode[]) tmpMap[intValue];
					node[1].next = k;
					tmpMap[intValue] = new ListNode[]{node[0], k};
				} else {
					tmpMap[intValue] = new ListNode[]{k, k};
				}
				prev = k;
				k = k.next;
				if (k != null && prev.val != k.val) {
					prev.next = null;
				}
			}
			prev = null;
		}

		ListNode firstNode = null;
		ListNode[] curr;
		int i = 0;
		while (i < tmpMap.length) {
			curr = (ListNode[]) tmpMap[i];
			if (curr != null) {
				if (prev != null) {
					prev.next = curr[0];
				} else {
					firstNode = curr[0];
				}
				prev = curr[1];
			}
			i++;
		}

		return firstNode;
	}
}
