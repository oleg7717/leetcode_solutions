package ru.leetcode;

public class Main {
	public static void main(String[] args) {
		char[][] grid = {
				"11000".toCharArray(),
				"11000".toCharArray(),
				"00100".toCharArray(),
				"00011".toCharArray()
			};

		System.out.println(new Solution().numIslands(grid));
	}
}