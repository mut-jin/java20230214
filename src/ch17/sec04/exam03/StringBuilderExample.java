package ch17.sec04.exam03;

public class StringBuilderExample {
	public static void main(String[] args) {
		// StringBuilder vs String
		
		// StringBuilder 는 문자열 수정 가능
		// String 문자열 수정 불가
		
		String a = "java"; // hello
		String b = "html"; // 
		
		String c = a + "hello";
		String d = b + "hello";
		
		
		
		StringBuilder e = new StringBuilder("java");
		StringBuilder f = new StringBuilder("html");
		
		System.out.println(e);
		System.out.println(f);
		
		e.append("hello");
		f.append("hello");
		
		System.out.println(e);
		System.out.println(f);
		
	}
}
