package ch15.lecture.p03set;

import java.util.*;

public class C03RemoveIf {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		set.removeIf(e -> (e.length() % 2) == 0);
		
		System.out.println(set);
	}
}
