package ru.leetcode;

public class Main {
	public static void main(String[] args) {
		Object[] elem = {5,3,6,2,4,null,null,1};
		int j = 0;
		TreeNode currentR;
		TreeNode currentL;

		TreeNode current =  new TreeNode((int) elem[0]/*, null*/);
		TreeNode root = current;
		j++;
		TreeNode left = (j < elem.length && elem[j] != null) ? new TreeNode((int) elem[j]) : null;
		j++;
		TreeNode right = (j < elem.length && elem[j] != null) ? new TreeNode((int) elem[j]) : null;
		current.setLeft(left);
		current.setRight(right);

		currentL = current.left;
		j++;
		left = (j < elem.length && elem[j] != null) ? new TreeNode((int) elem[j]) : null;
		j++;
		right = (j < elem.length && elem[j] != null) ? new TreeNode((int) elem[j]) : null;
		currentL.setLeft(left);
		currentL.setRight(right);

		currentR = current.right;
		j++;
		left = (j < elem.length && elem[j] != null) ? new TreeNode((int) elem[j]) : null;
		j++;
		right = (j < elem.length && elem[j] != null) ? new TreeNode((int) elem[j]) : null;
		currentR.setLeft(left);
		currentR.setRight(right);

		currentR = currentL.left;
		j++;
		left = (j < elem.length && elem[j] != null) ? new TreeNode((int) elem[j]) : null;
		j++;
		right = (j < elem.length && elem[j] != null) ? new TreeNode((int) elem[j]) : null;
		currentR.setLeft(left);
		currentR.setRight(right);

		System.out.println(new Solution().kthSmallest(root, 3));
	}
}