package com.kh.array;

public class Exam_ArraySort1 {
	// {1, 54, 22, 7, 4} 를
	// {1, 4, 7, 22, 54} 와
	// {54, 22, 7, 4, 1} 로 정렬 할 수 있음.
	public static void main(String []args) {
		
		int num1 = 22;
		int num2 = 54; 
		int temp; // 임시 변수

		System.out.println("====== 변경 전 ======");
		System.out.printf("num1 : %d, num2 : %d \n", num1, num2);
		
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("====== 변경 후 ======");
		System.out.printf("num1 : %d, num2 : %d", num1, num2);
		
	}
}
