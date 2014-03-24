package com.example.bob;

import java.util.Arrays;

public class Quicksort {

  public static void main(String[] args) {
    Quicksort qs = new Quicksort();
    int[] a = {2,6,5,1,9,4,3,7,8};
    System.out.println(Arrays.toString(a));
    qs.quicksort(a, 0, a.length -1);
    System.out.println(Arrays.toString(a));
    
  }
  public void quicksort(int[] a, int lo, int hi) {
    if ( lo >= hi) return;
    int p = partition(a, lo, hi);
    quicksort(a, lo, p-1);
    quicksort(a, p+1, hi);
  }
  
  private int partition(int[] a, int lo, int hi) {
    int i = lo;
    int j = hi + 1;
    while(true) {
      while (a[lo] > a[++i] && i != hi);
      while (a[lo] < a[--j] && j != lo);
      if (i >= j) break;
      swap(a, i, j);
    }
    swap(a, lo, j);
    return j;
    
  }

  private void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
}
