package com.kh.array;

public class Exam_ArraySort4 {
	
	public static void main(String []args) {
		// ��������(Selection Sort)
		// �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� �˰��� ����
		// Ư¡ : �������� ���� ���� ��, ���� ������ �����ִ� ���� (��ȯȽ�� ����)
		//		  �������� ���� ���� ��, �ް��� ���� ���ϸ� ����
		// �迭�� n�� �ε��� ���� n+1�� ~ ������ �ε������� ��
		int [] arrs = { 2, 5, 4, 1, 3};
		
		int min;
		for(int i=0; i<arrs.length-1; i++) { //-1 ���� => ������ ��Ҵ� �ڿ������� ���ĵ�
			min = i; // min�� index ����
			for(int j=i+1; j<arrs.length; j++) { //�� ���� �ͺ��� �� ����
				if (arrs[min]>arrs[j]) { //�ּҰ��� �� ����
					min = j;
				}
			}
			System.out.println("��ȯ �߻�");
			int temp = arrs[min];
			arrs[min]=arrs[i];
			arrs[i]=temp;
		}
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
	}

}
