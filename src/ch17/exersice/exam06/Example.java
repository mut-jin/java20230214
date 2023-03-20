package ch17.exersice.exam06;

import java.util.*;
import java.util.stream.*;

import ch17.sec07.exam01.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
				);
		
		// for 사용
		double sum = 0;
		for(Member i : list) {
			sum += i.getAge();
		}
		double avg = sum / list.size();
		System.out.println(avg);
		
		// IntStream, average 사용
		double avg2 = list.stream()
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println(avg2);
		
		// stream collect 사용
		double avg3 = list.stream()
				.collect(Collectors.averagingDouble(Member::getAge));
		System.out.println(avg3);
	}
}
