package ch17.exersice.exam05;

import java.util.*;

import ch16.exersice.exam05.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions");

		for (String s : list) {
			if (s.toLowerCase().contains("java")) {
				System.out.println(s);
			}
		}

		list.stream()
				.filter(s -> s.toLowerCase().contains("java"))
				.forEach(s -> System.out.println(s));

		list.stream()
				.filter(Example::havingJava)
				.forEach(System.out::println);
	}

	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}
}
