package com.example;

public class SelectionSort {

	public void sort(int[] nums) {
		for (int i=0;i<nums.length;i++) {
			int k = i;
			for (int j=i+1;j < nums.length;j++){
				if (nums[j] < nums[k]) {
					k = j;
				}
			}
			if (k != i) {
				int temp = nums[i];
				nums[i] = nums[k];
				nums[k] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int nums[] = {3,5,1,7,4,2,6,9,8};
		SelectionSort ss = new SelectionSort();
		ss.print(nums);
		ss.sort(nums);
		ss.print(nums);
	}
	private void print(int[] nums){
		System.out.print("[");
		for (int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("]");
	}
}
