package com.kh.array;

public class Exam_ArraySort5 {
	public static void main(String[] args) {
		// �������� (Bubble Sort)
		// ������ �ΰ��� ���Ҹ� �˻��Ͽ� �����ϴ� ���
		// ������ ���ٴ� ������ �ְ� �̹� ���ĵ� �����͸� ������ �� ���� ����
		// �ٸ� ���Ŀ� ���� ���� �ӵ��� ������, �������� ������ �� ���� ����

		int[] arrs = { 2, 5, 4, 1, 3 };

		// ��ø(for)�� �ʿ�
		for (int i = 0; i < arrs.length - 1; i++) {
			for (int j = 0; j < (arrs.length - 1) - i; j++) {
				// for (int j=0; i<(arrs.length-1)-i; j--) {

				if (arrs[j] > arrs[j + 1]) {
					System.out.println("��ȯ�߻�");

					// ���� ���� ����������
					int temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;

					// ������ ���� �������� => ����� ������ �ڵ�� ���� �ٸ���.
					// int temp = arrs[j+1];
					// arrs[j+1] = arrs[j];
					// arrs[j] = temp;
				}
			}
		}
		// ���
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
}
