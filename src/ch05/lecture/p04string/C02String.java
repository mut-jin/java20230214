package ch05.lecture.p04string;

public class C02String {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = "java";
		String str3 = "java";
		
		System.out.println(str2 == str3);
		System.out.println(str1 == str2);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}
}
