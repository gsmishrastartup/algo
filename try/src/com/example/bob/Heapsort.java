package com.example.bob;

import java.util.Arrays;

public class Heapsort {

  public static void main(String[] args) {
    Heapsort hs = new Heapsort();
    int[] arr = {0,2,5,6,3,9,1,4,7,8,10};
    System.out.println(Arrays.toString(arr));
    hs.sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public void sort(int[] arr) {
    int N = arr.length -1;
    heapify(arr, N);
    while (N > 1) {
      swap(arr, 1, N--);
      sink(arr, N, 1);
    }
  }

  private void heapify(int[] arr, int N) {
    for(int i=N/2; i >=1;i--) sink(arr, N, i);
  }

  private void sink(int[] arr, int N, int i) {
    while (i*2 <= N) {
      int j = i * 2;
      if (j < N && arr[j] < arr[j+1]) j++;
      if (arr[i] < arr[j]) {
        swap(arr, i, j);
        i = j;
      } else {
        break;
      }
    }
  }

  protected void swap(int[] arr, int i, int j) {
    System.out.println("swapped");
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
    
  }
}
