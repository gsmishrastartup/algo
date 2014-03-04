package com.example;

public class FindOddOccuranceInArray {

	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 2};
		int val = 0;
		for (int i=0; i< nums.length; i++) {
			val ^= nums[i];
			System.out.println(val);
		}
		System.out.println(val);
	}
}
