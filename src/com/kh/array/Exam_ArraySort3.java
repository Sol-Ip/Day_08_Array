package com.kh.array;

public class Exam_ArraySort3 {
	   public static void main(String [] args) {
		      // ����, ���ļ���, ����
		      // ���� �ذ� �˰���, ���� �˰���
		      // {2,5,4,1,3} -> {1,2,3,4,5}
		      // ��������, ��������, ��������,
		   
		      // - �������� (Insertion Sort)
		      // ���� �˰��� �� ���� �����ϰ� �⺻�� �Ǵ� �˰���
		      // �迭�� n�� �ε��� ���� 0�� n-1�� �ε������� ��
		   
		int[] arrs = { 2, 5, 4, 1, 3 };

		// �������� ����
		// i�� ȭ��ǥ��� ����
		for (int i = 1; i < arrs.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arrs[j - 1] > arrs[j]) {
					System.out.println("��ȯ �߻�");
					int temp = arrs[j - 1];
					arrs[j - 1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		// ���
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + "  ");
		}
	}

}
