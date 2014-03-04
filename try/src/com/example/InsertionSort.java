package com.example;

public class InsertionSort {

	public static void main(String[] args) {
		int nums[] = {3,5,1,7,4,2,6,9,8};
		InsertionSort is = new InsertionSort();
		is.print(nums);
		is.sort(nums);
		is.print(nums);
	}
	public void sort(int[] nums) {
		for (int i=1;i< nums.length;i++) {
			int temp = nums[i];
			int j = i - 1;
//			boolean swap = false;
			while (j>=0 && temp < nums[j]) {
				nums[j+1] = nums[j];
				j--;
			//	swap = true;
			}
			 nums[j+1] = temp;
			print(nums);
		}
	}
	private void print(int[] nums){
		System.out.print("[");
		for (int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("]");
	}
}
