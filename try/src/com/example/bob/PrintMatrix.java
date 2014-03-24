package com.example.bob;

public class PrintMatrix {

  public static void main(String[] args) {

    int[][] a = new int[3][3];
    a[0][0] = 1;
    a[0][1] = 2;
    a[0][2] = 3;
    a[1][0] = 4;
    a[1][1] = 5;
    a[1][2] = 6;
    a[2][0] = 7;
    a[2][1] = 8;
    a[2][2] = 9;
    
    int n = 3;
    for (int k = 0; k < n; k++) {
      int j = 0;
      int i = k;
      while (j < n && i >=0) {
        System.out.println(a[i--][j++]);
      }
    }
  }
}
