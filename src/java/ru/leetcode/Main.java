package ru.leetcode;

public class Main {
	public static void main(String[] args) {
		MedianFinder obj = new MedianFinder();
		obj.addNum(1);
		obj.addNum(2);
		double param_1 = obj.findMedian();
		obj.addNum(3);
		obj.addNum(6);
		obj.addNum(5);
		double param_4 = obj.findMedian();
		obj.addNum(0);
		obj.addNum(6);
		double param_5 = obj.findMedian();
	}
}