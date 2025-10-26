package ru.leetcode;

public class Solution {
	private char[][] board;
	private String word;
	private int boardHight;
	private int boardWeight;
	private int[] prev = new int[56];

	public boolean exist(char[][] board, String word) {
		if (word.length() > board.length * board[0].length) return false;
		this.word = word;
		this.board = board;
		boardHight = board.length - 1;
		boardWeight = board[0].length - 1;
		int backward;
		char firstChar = word.charAt(0);
		for (int i = 0; i <= boardHight / 2; i++) {
			backward = boardHight - i;
			if (i > backward) {
				return false;
			}
			for (int j = 0; j <= boardWeight; j++) {
				if (i == backward && j > boardWeight - j) {
					return false;
				}

				if (board[i][j] == firstChar) {
					if (word.length() == 1 || nextChar(i, j, 1)) return true;
				}
				if (board[backward][boardWeight - j] == firstChar) {
					if (word.length() == 1 || nextChar(backward, boardWeight - j, 1)) return true;
				}
			}
		}

		return false;
	}

	private boolean nextChar(int i, int j, int charPos) {
		boolean lastChar = word.length() == charPos + 1;
		char currChar = word.charAt(charPos);
		prev[10 * i + j] = 1;
		if (i < boardHight && prev[(i + 1) * 10 + j] == 0 && board[i + 1][j] == currChar
				&& (lastChar || nextChar(i + 1, j, charPos + 1))) return true;
		if (j < boardWeight && prev[i * 10 + j + 1] == 0 && board[i][j + 1] == currChar
				&& (lastChar || nextChar(i, j + 1, charPos + 1))) return true;
		if (i > 0 && prev[(i - 1) * 10 + j] == 0 && board[i - 1][j] == currChar
				&& (lastChar || nextChar(i - 1, j, charPos + 1))) return true;
		if (j > 0 && prev[i * 10 + j - 1] == 0 && board[i][j - 1] == currChar
				&& (lastChar || nextChar(i, j - 1, charPos + 1))) return true;
		prev[10 * i + j] = 0;

		return false;
	}
}
