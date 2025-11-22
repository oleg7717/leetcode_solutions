package ru.leetcode;

class Solution {
	public int numIslands(char[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;

		int islandCount = 0;

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if (grid[row][col] == '1') {
					dfs(grid, row, col);
					islandCount++;
				}
			}
		}

		return islandCount;
	}

	private void dfs(char[][] grid, int r, int c) {
		int row = grid.length;
		int col = grid[0].length;

		if (r < 0 || r >= row || c < 0 || c >= col || grid[r][c] != '1') return;
		grid[r][c] = '0';

		dfs(grid , r + 1 , c);
		dfs(grid , r , c + 1);
		dfs(grid , r - 1 , c);
		dfs(grid , r , c - 1);
	}
}