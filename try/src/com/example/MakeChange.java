package com.example;

public class MakeChange {

	public static void main(String[] args) {
		System.out.println(makeChange(10, 5));
	}

	private static int makeChange(int n, int denom) {
		if (n == 0) return 0;
		int next_denom = 0;
		switch (denom) {
//			case 25:
//				next_denom = 10;
//				break;
//			case 10:
//				next_denom = 5;
//				break;
			case 5:
				next_denom = 1;
				break;
			case 1:
				return 1;
		}
		int ways = 0;
		for (int i = 0; i*denom <= n; i++){
			//System.out.println(i*denom);
			ways += makeChange(n - i*denom, next_denom);
		}
		return ways;
	}
}
