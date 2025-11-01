package ru.leetcode;

class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s.isEmpty()) return 0;
		int max = 1;
		int lngth = s.length();
		int size = 100;
		char[] chars = new char[size];
		char ch;
		for (int i = 0; i < lngth; i++) {
			if (max > lngth) break;
			ch = s.charAt(i);
			for (int j = 0; j < lngth; j++) {
				int next = j + 1;
				if (chars[j] == 0) {
					chars[j] = ch;
					if ((next) > max) {
						max = next;
					}
					break;
				} else if (chars[j] != ch) continue;
				if (chars[j] == ch){
					System.arraycopy(chars, next, chars, 0, size - (next));
					j = -1;
				}
			}
		}
		return max;
	}
}
