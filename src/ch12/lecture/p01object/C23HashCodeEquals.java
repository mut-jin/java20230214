package ch12.lecture.p01object;

import java.util.*;

public class C23HashCodeEquals {
	public static void main(String[] args) {
		// 중복 없는 원소의 모임(Collection)
		Set set = new HashSet();
		
		System.out.println(set.size());
		
		set.add(100);
		
		System.out.println(set.size());
		
		set.add(200);
		
		System.out.println(set.size());
		
		// 존재하지 않으면 추가
		// 이미 있으니까 안들어감
		set.add(100);
		
		System.out.println(set.size());
	}
}
