package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C19Sorted {
	public static void main(String[] args) {
		IntStream.range(1, 6)
			
			// 중간 연산 작성
			.boxed()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}
}
