package ru.leetcode;

public class Main {
	public static void main(String[] args) {
		int[] nums1 = {3,0,1};
		int[] nums3 = {0,1};
		int[] nums2 = {9,6,4,2,3,5,7,0,1};
		System.out.println(new Solution().missingNumber(nums1));
		System.out.println(new Solution().missingNumber(nums2));
		System.out.println(new Solution().missingNumber(nums3));
	}
}