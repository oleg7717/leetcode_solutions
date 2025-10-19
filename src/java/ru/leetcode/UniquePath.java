package ru.leetcode;

public class UniquePath {
	public int uniquePaths(int m, int n) {
		if (1 == m || 1 == n) return 1;
		int[][] cells = new int[m][n];
		for(int i = m - 2; i >= 0; i--) {
			for(int j = n - 2; j >= 0; j--) {
				cells[i][j] = (i + 2 == m ? 1 : cells[i + 1][j]) + (j + 2 == n ? 1 : cells[i][j + 1]);
			}
		}

		return cells[0][0];
	}
}
