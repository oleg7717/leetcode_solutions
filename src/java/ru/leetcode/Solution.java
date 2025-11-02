package ru.leetcode;

public class Solution {
	public int hammingWeight(int n) {
		int hammingWeight = 0;
		while (n != 0) {
			n &= (n - 1);
			hammingWeight++;
		}

		return hammingWeight;
	}
}
