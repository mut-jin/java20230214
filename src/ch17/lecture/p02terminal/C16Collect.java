package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C16Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 2, 3, 2, 2, 2);
		
		Map<Integer, Long> r1 = list.stream()
			.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		System.out.println(r1);
		
		// 밸류는 같은키가 들어올 때마다 (n, 이전값+1), 없으면 (n, 1)
		// 키는 입력한 값
		Map<Integer, Integer> r2 = new HashMap<>();
		for(Integer n : list) {
			Integer oldValue = r2.get(n);
			
			if(oldValue == null) {
				r2.put(n, 1);
			} else {
				r2.put(n, oldValue + 1);
			}
		}
		System.out.println(r2);
	}
}

