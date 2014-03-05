package com.example.bob;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = {3,4,7,1,6,2,9,10,5};
		print(a);
		MergeSort ms = new MergeSort();
		ms.sort(a);
		print(a);
	}

	public void sort(int[] a) {
		int[] aux = new int[a.length];
		sort(a, aux, 0, a.length-1);
	}

	private void sort(int[] a, int[] aux, int low, int high) {
		if (low >= high) return;
		int mid = (low+high)/2;
		sort(a, aux, low, mid);
		sort(a, aux, mid+1, high);
		merge(a, aux, low, mid, high);
	}

	private void merge(int[] a, int[] aux, int low, int mid, int high) {
		for (int i=low; i <= high; i++) {
			aux[i] = a[i];
		}
		print(aux);
		int i = low;
		int j = mid + 1;
		for (int k=low; k <= high; k++) {
			if (i > mid) a[k] = aux[j++];
			else if (j > high) a[k] = aux[i++];
			else if (aux[j] < aux[i]) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
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
