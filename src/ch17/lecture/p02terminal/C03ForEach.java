package ch17.lecture.p02terminal;

import java.util.*;

public class C03ForEach {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");

		list.stream()
				.forEach(s -> System.out.println(s));

		list.stream()
				.forEach(s -> System.out.println("원소: " + s));
		
		
	}
}
