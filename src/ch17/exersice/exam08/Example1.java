package ch17.exersice.exam08;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		List<Member> list = List.of(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		Map<String, List<Member>> m1 = new HashMap<>();

		for (Member member : list) {
			List<Member> val = m1.get(member.getJob());

			if (val == null) {
				val = new ArrayList<>();
				m1.put(member.getJob(), val);
			}
			val.add(member);
		}

		System.out.println("[개발자]");
		List<Member> dev = m1.get("개발자");
		for (Member d : dev) {
			System.out.println(d);
		}

		System.out.println();

		System.out.println("[디자이너]");
		List<Member> des = m1.get("디자이너");
		for (Member d : des) {
			System.out.println(d);
		}
	}
}
