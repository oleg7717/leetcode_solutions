package ru.leetcode;

import java.util.Arrays;

class Solution {
	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) return 0;
		if (nums.length == 1) return 1;
		Arrays.sort(nums);
		int count = 1;
		int max = 1;
		for (int i = nums.length - 1; i >= 1; i--) {
			if (nums[i] == nums[i - 1]) {
				continue;
			}
			if (nums[i] - nums[i - 1] == 1) {
				count++;
			} else {
				count = 1;
			}
			if (count > max) {
				max = count;
			}
		}

		return max;
	}
}
