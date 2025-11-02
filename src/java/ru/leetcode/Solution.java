package ru.leetcode;

public class Solution {
	public int maxProfit(int[] prices) {
		int minPrice = 10000;
		int maxPrice = 0;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			int j = prices.length - 1;
			if (i > j) break;
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
			if (prices[j] > maxPrice) {
				maxPrice = prices[j];
			} else if (maxPrice - prices[j] > maxProfit) {
				maxProfit = maxPrice - prices[j];
			}
		}

		return maxProfit;
	}
}
