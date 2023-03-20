package ch17.exersice.exam07;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		List<Member> list2 = new ArrayList<>();

		for(Member s : list) {
			if(s.getJob().equals("개발자")) {
				list2.add(s);
			}
		}
		
		for(Member member : list2) {
			System.out.println(member.getName());
		}
		
		list.stream()
			.filter(member -> member.getJob().equals("개발자"))
			.map(Member::getName)
			.forEach(System.out::println);
		
		List<Member> developers = list.stream()
					.filter(member -> member.getJob().equals("개발자"))
					.collect(Collectors.toList());
		
		developers.stream()
			.forEach(m -> System.out.println(m.getName()));
	}
}
