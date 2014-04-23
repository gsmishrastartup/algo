package com.example.bob;

import java.util.ArrayList;
import java.util.List;

public class Factors {

  public static void main(String[] args) {
    System.out.println(getPrimes(100));
  }
  public static List<Integer> getPrimes(int num) {
    List<Integer> primes = new ArrayList<Integer>();
    boolean[] iscomposite = new boolean[num+1];
    for (int i = 2; i < num; i++) {
      if (!iscomposite[i]) {
        primes.add(i);
        for (int j = (i*i); j < num; j+=i) {
          iscomposite[j] = true;
        }
      }
    }
    return primes;
  }
}
