package com.example.bob;

import java.util.Arrays;

public class PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(20);
		pq.insert(3);
		pq.insert(1);
		pq.insert(5);
		pq.insert(2);
		pq.insert(8);
		System.out.println(Arrays.toString(pq.arr));
		
		System.out.println(pq.delMax());
    System.out.println(Arrays.toString(pq.arr));
	}
	int[] arr;
	int count;
	public PriorityQueue(int size) {
		arr = new int[size+1];
		count = 0;
	}
	
	public void insert(int item) {
		arr[++count] = item;
		swim(count);
	}

	public int delMax() {
	  if (count < 1) return 0;
	  swap(1, count);
		int item = arr[count--];
		arr[count + 1] = 0;
		sink(1);
		return item;
	}
	
	
	protected void sink(int i) {
	  while (i * 2 <= count) {
	    int j = i*2;
	    if (j < count && arr[j] < arr[j+1]) j++;
	    if (arr[i] < arr[j]) {
	      swap(i, j);
	      i = j;
	    } else {
	      break;
	    }
	  }
  }

  protected void swim(int n) {
		while (n > 1 && n/2 >=1) {
			if (arr[n] > arr[n/2]) {
				swap(n, n/2);
				n = n/2;
			} else {
				break;
			}
		}
	}

	protected void swap(int n, int i) {
		int tmp = arr[n];
		arr[n] = arr[i];
		arr[i] = tmp;
		
	}
}
