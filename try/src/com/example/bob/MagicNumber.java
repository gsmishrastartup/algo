package com.example.bob;

public class MagicNumber {

  public static void main(String[] args) {
    for (int i = 316; i <= 999; i++) {
      String n = "" + i*i;
      int n1 = Integer.parseInt(n.substring(0,  3));
      int n2 = Integer.parseInt(n.substring(3));
      if ((n1+n2) == i) {
        System.out.println(n);
      }
    }
  }
}
