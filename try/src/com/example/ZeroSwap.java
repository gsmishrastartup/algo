package com.example;

public class ZeroSwap {

	public static void main(String[] args) {
		int[] nums = {6,4,3,0,1,2,5};
		print(nums);
		for (int i = 0; i < nums.length -1; i++){
			int zeroLoc = 0;
			int minLoc = 0;
			int min = Integer.MAX_VALUE;
			for (int j = i; j < nums.length; j++) {
				if ( nums[j] == 0) {
					zeroLoc = j;
				} else if (nums[j] < min) {
					min = nums[j];
					minLoc = j;
				}
			}
			if (minLoc != i) {
				int temp = nums[i];
				nums[i] = nums[zeroLoc];
				nums[zeroLoc] = temp;
				
				temp = nums[i];
				nums[i] = nums[minLoc];
				nums[minLoc] = temp;
			}
		}
		print(nums);
	}
	private static void print(int[] nums) {
		System.out.print("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("]");
	}
}
