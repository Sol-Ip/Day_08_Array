package com.kh.dimarray;

public class Exercise_DimArray5 {
	//  5  4  3  2  1
	//  6  7  8  9 10
	// 15 14 13 12 11
	// 16 17 18 19 20
	// 25 24 23 22 21
	// 행이 짝수 일 때, 열(j) 감소
	// 행이 홀수 일 때, 열(j) 증가
	public static void main(String[] args) {
		int[][] arrs = new int[5][5];
		int k = 1;

		for (int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) {
				// 짝수일 때 열값 감소
				for (int j = arrs[i].length-1; j >= 0; j--) {
					arrs[i][j] = k++;
				}
			} else {
				// 홀수일 때 열값 증가
				for (int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k++;
				}
			
			}
		}

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d \t", arrs[i][j]);
			}
			System.out.println();
		}
	}

}

