package ru.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int kthSmallest(TreeNode root, int k) {
		if (root.left == null && root.right == null) return 1;

		List<TreeNode> list = new ArrayList<>();
		TreeNode current = root;
		int i = 0;
		while(current != null || !list.isEmpty()) {
			while (current != null) {
				list.add(current);
				current = current.left;
			}

			if (!list.isEmpty()) {
				i++;
				current = list.remove(list.size() - 1);
				if (i == k) return current.val;
				current = current.right;
			}
		}

		return 1;
	}
}
