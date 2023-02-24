package ch05.lecture.p08regex;

public class C10RegEx {
	public static void main(String[] args) {
	// quantifier (수량자)
	
	// 숫자 3개인가?
		System.out.println("010".matches("[0-9][0-9][0-9]"));
		System.out.println("010".matches("[0-9]{3}"));
		System.out.println("010".matches("[0-9]{3}"));
		System.out.println("01".matches("[0-9]{3}"));
		System.out.println("33".matches("[0-9]{3}"));
		System.out.println("03".matches("[0-9]{3}"));
		System.out.println("00".matches("[0-9]{3}"));
	}
}
