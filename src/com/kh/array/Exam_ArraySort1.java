package com.kh.array;

public class Exam_ArraySort1 {
	// {1, 54, 22, 7, 4} ��
	// {1, 4, 7, 22, 54} ��
	// {54, 22, 7, 4, 1} �� ���� �� �� ����.
	public static void main(String []args) {
		
		int num1 = 22;
		int num2 = 54; 
		int temp; // �ӽ� ����

		System.out.println("====== ���� �� ======");
		System.out.printf("num1 : %d, num2 : %d \n", num1, num2);
		
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("====== ���� �� ======");
		System.out.printf("num1 : %d, num2 : %d", num1, num2);
		
	}
}
