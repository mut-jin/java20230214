package ch17.lecture.p03intermediate;

import java.util.*;

public class C06Peek {
	public static void main(String[] args) {
		(new Random()).ints(5)
				.peek(System.out::println)
				.forEach(System.out::println);
	}
}
