package ru.leetcode;

public class Main {
	public static void main(String[] args) {
		int[][] intervals1 = {{1,2},{2,3},{3,4},{1,3}};
		int[][] intervals2 = {{1,2},{1,2},{1,2}};
		int[][] intervals3 = {{1,2},{2,3}};
		int[][] intervals4 = {{1,100},{1,11},{2,12},{11,22}};
		int[][] intervals5 = {{0,2},{1,3},{2,4},{3,5},{4,6}};
		int[][] intervals6 = {{0,2},{1,3},{1,3},{2,4},{3,5},{3,5},{4,6}};
		System.out.println(new Solution().eraseOverlapIntervals(intervals1));
		System.out.println(new Solution().eraseOverlapIntervals(intervals2));
		System.out.println(new Solution().eraseOverlapIntervals(intervals3));
		System.out.println(new Solution().eraseOverlapIntervals(intervals4));
		System.out.println(new Solution().eraseOverlapIntervals(intervals5));
		System.out.println(new Solution().eraseOverlapIntervals(intervals6));
	}
}