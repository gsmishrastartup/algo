package com.example;

import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		String reverseThis = "hello my name is alisha";
		String newString = reverse(reverseThis);
		System.out.println(newString);
		StringTokenizer st = new StringTokenizer(newString, " ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreTokens()) {
			sb.append(reverse(st.nextToken())).append(" ");
		}
		System.out.println(sb.toString());
	}

	private static String reverse(String reverseThis) {
		int left = 0;
		char[] chars = reverseThis.toCharArray();
		int right = chars.length - 1;
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return String.valueOf(chars);
	}
}
