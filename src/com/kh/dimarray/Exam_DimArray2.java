package com.kh.dimarray;

public class Exam_DimArray2 {
	//  0  1  2  3  4 
	//  5  6  7  8  9
	// 10 11 12 13 14
	// 15 16 17 18 19
	// 20 21 22 23 24
	
	public static void main(String[] args) {
		int[][] arrs = new int[5][5];
		int k = 0;

		
		for (int i = 0; i < arrs.length; i++) { 
			for (int j = 0; j < arrs[i].length; j++) { 
				arrs[i][j] = k;
				k++;
			}
		}
		
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
}