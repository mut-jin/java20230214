package ch17.lecture.p02terminal;

import java.util.*;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 9, 8, 7);
		
		List<Integer> r1 = list.stream()
			.collect(ArrayList::new, List::add, List::addAll);
		
		System.out.println(r1);
	}
}
