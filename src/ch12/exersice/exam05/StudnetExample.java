package ch12.exersice.exam05;

import java.util.*;

public class StudnetExample {
	public static void main(String[] args) {
		// Student 를 저장하는 HashSet 생성
		HashSet hashSet = new HashSet();
		
		// Student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1")); // 같은 학번이므로 중복 저장이 안됨
		hashSet.add(new Student("2"));
		
		// 저장된 Student 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());
	}
}
