package com.kh.dimarray;

public class Exam_DimArray1 {
	//  0  1  2  3
	//  4  5  6  7
	//  8  9 10 11
	// 12 13 14 15
	
	public static void main(String[] args) {
		int[][] arrs = new int[4][4];
		int k = 0;

		// for���� �̿��Ͽ� �ʱ�ȭ - �Է�
		for (int i = 0; i < arrs.length; i++) { // >>>> ��
			for (int j = 0; j < arrs[i].length; j++) { // >>>> ��
				arrs[i][j] = k;
				k++;
			}
		}
		// for���� �̿��Ͽ� ���
		for (int i = 0; i < arrs.length; i++) { // >>>> ��
			for (int j = 0; j < arrs[i].length; j++) { // >>>> ��
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
}
