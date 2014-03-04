package com.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedian {

	public static void main(String[] args) {
		FindMedian fm = new FindMedian();
		fm.insert(2);
		fm.insert(7);
		fm.insert(4);
		fm.insert(34);
		fm.insert(22);
		fm.insert(33);
		fm.insert(24);
		fm.insert(35);
		System.out.println(fm.max.size());
		System.out.println(fm.min.size());
		System.out.println(fm.get());
		fm.min.poll();
		System.out.println(fm.get());
		
		
	}
	private PriorityQueue<Integer> max = new PriorityQueue<Integer>(20, maxComparator);
	private PriorityQueue<Integer> min = new PriorityQueue<Integer>(20, minComparator);
	
	public void insert(int number) {
		if (max.size() == min.size()) {
			if (min.peek() != null && number > min.peek()) {
				max.offer(min.poll());
				min.offer(number);
			}
			else {
				max.offer(number);
			}
		} else {
			if (number < max.peek()) {
				min.offer(max.poll());
				max.offer(number);
			} else {
				min.offer(number);
			}
		}
	}
	
	public int get() {
		if (max.size() == min.size()) {
			return (max.peek() + min.peek())/2;
		} else if (max.size() > min.size()) {
			return max.peek();
		} else {
			return min.peek();
		}
	}
	
	public static Comparator<Integer> minComparator = new Comparator<Integer>(){

		@Override
		public int compare(Integer arg0, Integer arg1) {
			if (arg0 > arg1) {
				return 1;
			} else if (arg0 < arg1){
				return -1;
			}
			return 0;
		}
		
	};
	public static Comparator<Integer> maxComparator = new Comparator<Integer>(){

		@Override
		public int compare(Integer arg0, Integer arg1) {
			if (arg0 < arg1) {
				return 1;
			} else if (arg0 > arg1){
				return -1;
			}
			return 0;
		}
		
	};
}
