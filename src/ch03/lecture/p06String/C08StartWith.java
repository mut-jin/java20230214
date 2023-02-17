package ch03.lecture.p06String;

public class C08StartWith {
	public static void main(String[] args) {
		// startWith
		// 특정 문자열로 시작하는 지?
		// return type : boolean
		
		// codingbat 문제 : Warmup-1, notString
		
		String str1 = "spring";
		
		System.out.println(str1.startsWith("s")); // true
		System.out.println(str1.startsWith("sp")); // true
		System.out.println(str1.startsWith("pr")); // false
		
		// endWith
		// 특정 문자열로 끝나는 지?
		// return type : boolean
		System.out.println(str1.endsWith("g")); // true
		System.out.println(str1.endsWith("ng")); // true
		System.out.println(str1.endsWith("s")); // false
	}
}
