package com.example;

public class PrintParen {

	public static void main(String[] args) {
		PrintParen pp = new PrintParen();
		int count = 5;
		char[] str = new char[2*count];
		pp.printParen(count, count, str, 0);
	}

	private void printParen(int l, int r, char[] str, int i) {
		if (l > r) return;
		if (l == 0 && r == 0) {
			System.out.println(str);
			return;
		}
		if (l > 0) {
			str[i] = '(';
			printParen(l - 1, r, str, i + 1);
		}
		if (r > 0) {
			str[i] = ')';
			printParen(l, r - 1, str, i + 1);
		}
	}
}
