package com.kh.dimarray;

public class Exercise_DimArray6 {
		// 1 10 11 20 21
		// 2  9 12 19 22
		// 3  8 13 18 23
		// 4  7 14 17 24
		// 5  6 15 16 25
		// ���� ¦���� ��, ���� ����
		// ���� Ȧ���� ��, ���� ����
		
		public static void main(String []args) {
			int [][] arrs = new int[5][5];
			int k = 1;
			
			for (int j=0; j<arrs.length; j++) {
				if ( j%2==0) {
					// ���� ¦�� - �ప ����
					for (int i =0; i < arrs[j].length; i++) {
						arrs[i][j]=k++;
				 	}
					} else { //���� Ȧ�� - �ప ���� 
						for (int i=arrs[j].length-1; i>=0; i--) {
							arrs[i][j]=k++;
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



