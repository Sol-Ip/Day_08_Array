package com.kh.dimarray;

public class Exercise_DimArray6 {
		// 1 10 11 20 21
		// 2  9 12 19 22
		// 3  8 13 18 23
		// 4  7 14 17 24
		// 5  6 15 16 25
		// 열이 짝수일 때, 행이 증가
		// 열이 홀수일 때, 행이 감소
		
		public static void main(String []args) {
			int [][] arrs = new int[5][5];
			int k = 1;
			
			for (int j=0; j<arrs.length; j++) {
				if ( j%2==0) {
					// 열이 짝수 - 행값 증가
					for (int i =0; i < arrs[j].length; i++) {
						arrs[i][j]=k++;
				 	}
					} else { //열이 홀수 - 행값 감소 
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



