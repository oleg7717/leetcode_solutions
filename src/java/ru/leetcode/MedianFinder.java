package ru.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
	//Для половины элементов от минимального (корневой элемент) в сторону увеличения
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	//Для половины элементов от макисмального (корневой элемент) в сторону уменьшения
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

	public MedianFinder() {
	}

	public void addNum(int num) {
		if (!maxHeap.isEmpty() && num > maxHeap.peek()) {
			minHeap.add(num);
			if (minHeap.size() > maxHeap.size() + 1) {
				maxHeap.add(minHeap.poll());
			}
		} else {
			maxHeap.add(num);
			if (maxHeap.size() > minHeap.size() + 1) {
				minHeap.add(maxHeap.poll());
			}
		}
	}

	public double findMedian() {
		if (minHeap.size() == maxHeap.size()) {
			return (minHeap.peek() + maxHeap.peek()) / 2.0;
		} else {
			if (minHeap.size() > maxHeap.size()) return minHeap.peek();
			else return maxHeap.peek();
		}
	}
}
