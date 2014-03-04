package com.example;

public class BitManipulate {

	public static void main(String[] args) {
		int n = Integer.parseInt("10000100001", 2);
		int m = Integer.parseInt("1010", 2);
		
		int i = 2;
		int j = 6;
		
		int max = ~0;
		
		print(max);
		
		print(1 << j);
		
		int left = max - ((1 << j) - 1);
		
		print(left);
		
		int right = ((1 << i) - 1);
		
		print(right);
		
		int mask = left | right;
		
		print(mask);
		
		print(n & mask);
		print(m << i);
		
	}
	
	private static void print(int p) {
		System.out.println(Integer.toBinaryString(p));
	}
}
