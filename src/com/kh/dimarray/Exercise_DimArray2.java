package com.kh.dimarray;

public class Exercise_DimArray2 {
		// 5 10 15 20 25
		// 4  9 14 19 24
		// 3  8 13 18 23
		// 2  7 12 17 22
		// 1  6 11 16 21
	
		//행 감소 -> 열 증가
	public static void main (String[]args) {
		
		int[][] arrs = new int[5][5];
		int k = 1;
		
		for (int i = 0; i < arrs.length; i++) { 
			for (int j = arrs.length-1; j >=0; j--) { 
				arrs[j][i] = k;
				k++;

			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j<arrs[i].length; j++) {
				System.out.printf("%2d \t", arrs[i][j]);
			}
			System.out.println();
		}
	}

}
