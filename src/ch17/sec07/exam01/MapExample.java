package ch17.sec07.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		// Student를 score 스트림으로 변환
		studentList.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
		
		
		// max
		int max = studentList.stream()
			.mapToInt(Student::getScore)
			.max()
			.getAsInt();
		System.out.println(max);
		
		// min
		int min = studentList.stream()
				.mapToInt(Student::getScore)
				.min()
				.getAsInt();
		System.out.println(min);
		
		// sum
		int sum = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		System.out.println(sum);
		
		// avg
		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		// 통계
		IntSummaryStatistics summary = studentList.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		
		System.out.println("최대: " + summary.getMax());
		System.out.println("최소: " + summary.getMin());
		System.out.println("합계: " + summary.getSum());
		System.out.println("평균: " + summary.getAverage());
	}
}
