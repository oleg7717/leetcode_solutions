package ru.leetcode;

public class Main {
	public static void main(String[] args) {
		char[][] board0 = {"a".toCharArray()};
		String word0 = "a";
		char[][] board1 = {"ABCE".toCharArray(),"SFCS".toCharArray(),"ADEE".toCharArray()};
		String word1 = "ABCCED";
		char[][] board2 = {"CAA".toCharArray(),"AAA".toCharArray(),"BCD".toCharArray()};
		String word2 = "AAB";
		char[][] board3 = {"ABCE".toCharArray(), "SFCS".toCharArray(), "ADEE".toCharArray()};
		String word3 = "SEE";
		char[][] board4 = {"ABCE".toCharArray(), "SFCS".toCharArray(), "ADEE".toCharArray()};
		String word4 = "ABCB";
		char[][] board5 = {"aaaa".toCharArray(),"aaaa".toCharArray(),"aaaa".toCharArray()};
		String word5 = "aaaaaaaaaaaaa";
		char[][] board6 = { "aabaab".toCharArray(),
							"aabbba".toCharArray(),
							"aaaaba".toCharArray(),
							"babbab".toCharArray(),
							"abbaba".toCharArray(),
							"baaaab".toCharArray()};
		String word6 = "bbbaabbbbbab";

		System.out.println("board 0: " + new Solution().exist(board0, word0));
		System.out.println("board 1: " + new Solution().exist(board1, word1));
		System.out.println("board 2: " + new Solution().exist(board2, word2));
		System.out.println("board 3: " + new Solution().exist(board3, word3));
		System.out.println("board 4: " + new Solution().exist(board4, word4));
		System.out.println("board 5: " + new Solution().exist(board5, word5));
		System.out.println("board 6: " + new Solution().exist(board6, word6));

	}
}