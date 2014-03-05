package com.example.bob;

import java.util.ArrayList;
import java.util.List;

public class Prime {
	public static void main(String[] args) {
		System.out.println(primes(19));
	}
	public static List<Integer> primes(int n) {
		boolean[] isPrime = new boolean[n+1];
		List<Integer> primes = new ArrayList<Integer>();
		for(int i=0;i< n+1; i++) {
			isPrime[i] = true;
		}
		for (int i=2; i<= n; i++) {
			if (isPrime[i]) {
				primes.add(i);
				for (int j=i; j*i<=n;j++) {
					isPrime[j*i] = false;
				}
			}
		}
		return primes;
	}
}
