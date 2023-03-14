package ch15.exersice.exam0507;

import java.util.*;

public class Exam0507 {
	public static void main(String[] args) {
//		int[] array = {1, 5, 3, 8, 2};
		
		// of : 수정 불가 리스트 리턴
		List<Integer> list = List.of(1, 5, 3, 8, 2);
		
		// 위 리스트에서 최대값 구하는 코드 작성
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println(max);
		
		int max1 = Integer.MIN_VALUE;
		
		for(Integer e : list) {
			max1 = Math.max(max1, e);
		}
		
		System.out.println(max1);
	}
}
