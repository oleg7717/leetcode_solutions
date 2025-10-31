package ru.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length == 1) return 0;

		quickSort(intervals, 0, intervals.length - 1);
		int count = 0;
		for (int i = intervals.length - 1; i >= 0; i--) {
			if (i - 1 >= 0 && intervals[i][0] < intervals[i - 1][1]) {
				intervals[i - 1] = intervals[i];
				count++;
			}
		}

		return count;
	}

	private void quickSort(int[][] intervals, int low, int high) {
		List<Integer> stack = new ArrayList<>();
		stack.add(low);
		stack.add(high);
		while (!stack.isEmpty()) {
			high = stack.removeLast();
			low = stack.removeLast();

			if (low >= high) return;

			int middle = low + (high - low) / 2;
			int pivot = intervals[middle][0];

			int i = low;
			int j = high;

			while (i < j) {
				while (intervals[i][0] < pivot && i <= j) {
					i++;
				}

				while (intervals[j][0] > pivot && i <= j) {
					j--;
				}

				if (i <= j) {
					if ((i != j && intervals[i][0] != intervals[j][0])) {
						int[] temp = intervals[i];
						intervals[i] = intervals[j];
						intervals[j] = temp;
					}
					i++;
					j--;
				}
			}

			if (low < j) {
				stack.add(low);
				stack.add(j);
			}
			if (i < high) {
				stack.add(i);
				stack.add(high);
			}
		}
	}
}
