package ch15.exersice.exam0508;

import java.util.*;

public class Exam0508 {
	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88));
		
		// 문제 6
		System.out.println(list.size()); // ? 3?
		System.out.println(list.get(2).size()); // ? 5
		
		// 문제 8
		// 합, 평균 구하기
		
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		
		for (int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.get(i).size(); j++) {
				sum += list.get(i).get(j);
				cnt++;
			}
		}
		
		avg = sum / cnt;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}
