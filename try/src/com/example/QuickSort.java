package com.example;

public class QuickSort {
	private int[] nums;

	public static void main(String[] args) {
		int[] input = {3,5,2,10,8,4,9,7,1,6};
		QuickSort qs = new QuickSort();
		
		qs.sort(input);
	}

	private void print(int[] nums) {
		System.out.print("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("]");
	}

	public void sort(int[] input) {
		nums = input;
		print(nums);
		int l = nums.length;
		
		quicksort(0, l - 1);
		print(nums);
		
	}

	private void quicksort(int low, int high) {
		if (low > high) {
			return;
		}
		
		int pivotLocation = partitionArray(low, high);
		quicksort(low, pivotLocation - 1 );
		quicksort(pivotLocation + 1, high);
		
	}
	private int partitionArray(int low, int high) {
		int pivot = nums[high];
		int i = low - 1;
		int j = high;
		
		while (true) {
			while (i < high && nums[++i] < pivot);
			while (j > low && nums[--j] > pivot);
			if (i >= j) {
				break;
			} else {
				swap(i, j);
			}
			
		}
		swap(i, high);
		return i;
	}

	private void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}
}
