package ch03.lecture.p06String;

public class C11IsBlank {
	public static void main(String[] args) {
		// isBlank
		// 공백문자만 있는 지 확인?
		// return type : boolean
		
		String str1 = "  java  "; // false
		String str2 = "     "; //true
		String str3 = """
				
				
				"""; //true
		String str4 = ""; // true
		
		System.out.println(str1.isBlank()); // false
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank()); 
		System.out.println(str4.isBlank());
		
		System.out.println(str1.trim().isEmpty()); // false
		System.out.println(str2.trim().isEmpty());
		System.out.println(str3.trim().isEmpty());
		System.out.println(str4.trim().isEmpty());
		
	}
}
