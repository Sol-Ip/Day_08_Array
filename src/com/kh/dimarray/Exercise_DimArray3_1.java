package com.kh.dimarray;

public class Exercise_DimArray3_1 {
		// 1  6 11 16 21
		// 2  7 12 17 22
	    // 3  8 13 18 23
		// 4  9 14 19 24
		// 5 10 15 20 25
		// => ���� ������ ���¿��� ���� ����
		// ���� �ѹ� ������ �� ���� 5�� ������ (�� �켱)
	
	public static void main(String[]args) {
		int[][] arrs = new int[5][5];
		int k = 1;

		for (int j = 0; j < arrs.length; j++) { 
			for (int i = 0; i < arrs[j].length; i++) { 
				arrs[i][j] = k;
				k++;

			}
		}
		// ��� 
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j<arrs[i].length; j++) {
				System.out.printf("%2d \t", arrs[i][j]);
			}
			System.out.println();
		}
	}
}
