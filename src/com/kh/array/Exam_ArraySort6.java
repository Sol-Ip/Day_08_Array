package com.kh.array;

import java.util.Arrays;

public class Exam_ArraySort6 {
	public static void main(String []args) {
		// Arrays Ŭ������ �ִ� ��ɾ�(method)�� ����
		int [] arrs = {2,5,4,1,3};
		
		// ����
		// ���������� ���� ������ ���ο� �迭�� ����� �Ųٷ� �־�� ��
		Arrays.sort(arrs);
		// ���
		for (int i =0; i<arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
		System.out.println();
	}
}
