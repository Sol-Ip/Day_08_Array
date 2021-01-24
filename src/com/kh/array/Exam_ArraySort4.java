package com.kh.array;

public class Exam_ArraySort4 {
	
	public static void main(String []args) {
		// 선택정렬(Selection Sort)
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 알고리즘 정렬
		// 특징 : 데이터의 양이 적을 때, 좋은 성능을 보여주는 정렬 (교환횟수 적음)
		//		  데이터의 양이 많을 때, 급격한 성능 저하를 보임
		// 배열의 n번 인덱스 값을 n+1번 ~ 마지막 인덱스까지 비교
		int [] arrs = { 2, 5, 4, 1, 3};
		
		int min;
		for(int i=0; i<arrs.length-1; i++) { //-1 이유 => 마지막 요소는 자연스럽게 정렬됨
			min = i; // min에 index 지정
			for(int j=i+1; j<arrs.length; j++) { //그 다음 것부터 비교 시작
				if (arrs[min]>arrs[j]) { //최소값과 비교 진행
					min = j;
				}
			}
			System.out.println("교환 발생");
			int temp = arrs[min];
			arrs[min]=arrs[i];
			arrs[i]=temp;
		}
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
	}

}
