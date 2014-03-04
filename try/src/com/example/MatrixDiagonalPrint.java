package com.example;

public class MatrixDiagonalPrint {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		int[] m1 = { 1, 2, 3 };
		int[] m2 = { 4, 5, 6 };
		int[] m3 = { 7, 8, 9 };
		matrix[0] = m1;
		matrix[1] = m2;
		matrix[2] = m3;

		int i = 0;
		int j = 2;
		while (i < 3 && i >=0 && j < 3 && j >= 0) {
			printDiagonalDown(matrix, i, j);
			if (j > 0) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println("");
		i = 0;
		j = 0;
		while (i < 3 && i >=0 && j < 3 && j >= 0) {
			printDiagonalUp(matrix, i, j);
			if (i < 2) {
				i++;
			} else{
				j++;
			}
		}
		
//		for (int i = 0; i < 3; i++) {
//			int thisI = i;
//			for (int j = 2; j >= 0; j--) {
//				int thisJ = j;
//				int thisII = thisI;
//				while (thisJ < 3 && thisII < 3) {
//					System.out.println(matrix[thisII][thisJ]);
//					thisJ++;
//					thisII++;
//				}
//				
//			}
//			
//		}

		//		for (int j = 2; j > 0; j--) {
//			int i = 0;
//			int thisJ = j;
//			while (thisJ < 3) {
//				System.out.println(matrix[i][thisJ]);
//				thisJ++;
//				i++;
//			}
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println(matrix[i][i]);
//		}
//
//		for (int i = 1; i < 3; i++) {
//			int j = 0;
//			int thisI = i;
//			while (thisI < 3) {
//				System.out.println(matrix[thisI][j]);
//				thisI++;
//				j++;
//			}
//		}

	}

	private static void printDiagonalDown(int[][] matrix, int i, int j) {
		int thisI = i;
		int thisJ = j;
		while (thisJ < 3 && thisI < 3) {
			System.out.println(matrix[thisI][thisJ]);
			thisJ++;
			thisI++;
		}
	}
	private static void printDiagonalUp(int[][] matrix, int i, int j) {
		int thisI = i;
		int thisJ = j;
		while (thisI >= 0 && thisJ < 3) {
			System.out.println(matrix[thisI][thisJ]);
			thisJ++;
			thisI--;
		}
	}
}
