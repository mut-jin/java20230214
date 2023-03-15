package ch15.exersice.exam09;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0;		// 최고 점수를 저장하는 변수
		int totalScore = 0;		// 점수 합계를 저장하는 변수
		
		
		// 여기에 코드 작성 
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			totalScore += val;
			
			if (val > maxScore) {
				name = key;
				maxScore = val;
			}
		}
		double avg = totalScore / 3;
		
		System.out.println(totalScore / map.size());
		System.out.println(name);
		System.out.println(maxScore);
	}
}
