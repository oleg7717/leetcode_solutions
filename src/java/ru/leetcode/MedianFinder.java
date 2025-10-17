package ru.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
	//Для половины элементов от минимального (корневой элемент) в сторону увеличения
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	//Для половины элементов от макисмального (корневой элемент) в сторону уменьшения
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	private int minSize = 0;
	private int maxSize = 0;

	public MedianFinder() {
	}

	public void addNum(int num) {
		if (!maxHeap.isEmpty() && num > maxHeap.peek()) {
			minHeap.add(num);
			minSize++;
			if (minSize > maxSize + 1) {
				maxHeap.add(minHeap.poll());
				minSize--;
				maxSize++;
			}
		} else {
			maxHeap.add(num);
			maxSize++;
			if (maxSize > minSize + 1) {
				minHeap.add(maxHeap.poll());
				maxSize--;
				minSize++;
			}
		}
	}

	public double findMedian() {
		boolean even = (minSize + maxSize) % 2 == 0;
		if (even) {
			return (minHeap.peek() + maxHeap.peek()) / 2.0;
		} else {
			if (minSize > maxSize) return minHeap.peek();
			else return maxHeap.peek();
		}
	}
}
