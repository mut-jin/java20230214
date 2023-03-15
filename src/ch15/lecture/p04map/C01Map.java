package ch15.lecture.p04map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		// map
		// (key, value) 쌍 entry를 저장
		// key는 중복되지 않음
		
		Map<String, String> map = new HashMap<>();
		
		// entry 추가
		map.put("kang", "slamdunk");
		map.put("serly", "avartar");
		map.put("maverick", "topgun");
		
		// entry의 수, 키는 중복되지 않음
		int size = map.size();
		System.out.println(size);
		
		map.put("kang", "baseball"); // kang은 baseball로 바뀜
		
		System.out.println(map.size());
		
		// key로 value 얻기
		String v1 = map.get("serly");
		System.out.println(v1);
		System.out.println(map.get("kang"));
		
		// entry 지우기
		map.remove("kang");
		
		System.out.println(map.size());
		
		// 전체탐색
		System.out.println("keyset 사용##################");
		Set<String> keys = map.keySet(); // 키 set 얻기
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("foreach 메소드 $$$$$$$$$$$$$$");
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("entrySet 메소드 *************");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
