package ru.leetcode;

public class Solution {
	public int missingNumber(int[] nums) {
		if (nums.length == 1) return nums[0] == 0 ? 1 : 0;
		int missingNumber = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			missingNumber = missingNumber - nums[i] + (i + 1);
		}
		return missingNumber;
	}
}
