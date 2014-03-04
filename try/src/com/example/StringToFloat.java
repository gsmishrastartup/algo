package com.example;

public class StringToFloat {

	public static void main(String[] args) {
		char[] a = "123.45".toCharArray();
		int len = a.length;
		float result = 0.0f;
		int numpos = 0;
		for (int i=0; i< len;i++) {
			if (a[i] == '.') {
				numpos = len - i -1 ;
			} else {
				result = result*10.0f + (a[i] - '0');
			}
		}
		for (int i=0; i < numpos; i++) {
			result /= 10.0f;
		}
		System.out.println(result);
	}
}
