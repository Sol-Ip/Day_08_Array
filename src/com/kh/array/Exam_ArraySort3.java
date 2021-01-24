package com.kh.array;

public class Exam_ArraySort3 {
	   public static void main(String [] args) {
		      // 정렬, 정렬순서, 절차
		      // 문제 해결 알고리즘, 정렬 알고리즘
		      // {2,5,4,1,3} -> {1,2,3,4,5}
		      // 삽입정렬, 선택정렬, 버블정렬,
		   
		      // - 삽입정렬 (Insertion Sort)
		      // 정렬 알고리즘 중 가장 간단하고 기본이 되는 알고리즘
		      // 배열의 n번 인덱스 값을 0번 n-1번 인덱스까지 비교
		   
		int[] arrs = { 2, 5, 4, 1, 3 };

		// 오름차순 정렬
		// i가 화살표라고 생각
		for (int i = 1; i < arrs.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arrs[j - 1] > arrs[j]) {
					System.out.println("교환 발생");
					int temp = arrs[j - 1];
					arrs[j - 1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + "  ");
		}
	}

}
