package com.example;

public class MergeSort {
	private int[] numbers;
	private int[] helper;
	private int size;

	public void sort(int[] values) {
		this.size = values.length;
		this.numbers = values;
		this.helper = new int[this.size];
		mergesort(0, this.size-1);
	}

	private void mergesort(int low, int high) {
		if (low < high) {
			int mid = (high + low)/2;
			mergesort(low, mid);
			mergesort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	private void merge2(int low, int mid, int high) {
		for (int i=low; i<=high; i++){
			helper[i] = numbers[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		while ( i <= mid) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}

	private void merge(int low, int mid, int high) {
		for (int i=low; i<=high; i++){
			helper[i] = numbers[i];
		}
		int i = low;
		int j  = mid+1;
		for (int k=low; k<=high; k++) {
			if (i > mid) {
				numbers[k] = helper[j++];
			} else if (j > high) {
				numbers[k] = helper[i++];
			} else if (helper[i] < helper[j]) {
				numbers[k] = helper[i++];
			} else {
				numbers[k] = helper[j++];
			}
		}
	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int[] input = {2,5,10,6,1,9,4,3,7,8};
		print(input);
		mergeSort.sort(input);
		print(input);
	}

	private static void print(int[] input) {
		System.out.print("[");
		for (int i: input){
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println("]");
		
	}

}
