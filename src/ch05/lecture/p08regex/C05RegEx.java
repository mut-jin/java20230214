package ch05.lecture.p08regex;

public class C05RegEx {
	public static void main(String[] args) {
		// character class
		
		System.out.println("a".matches("[abcdefghijklmnopqrstuvwxyz]"));
		System.out.println("b".matches("[abcdefghijklmnopqrstuvwxyz]"));
		System.out.println("x".matches("[abcdefghijklmnopqrstuvwxyz]"));
		System.out.println("z".matches("[abcdefghijklmnopqrstuvwxyz]"));
		
		System.out.println("a".matches("[a-z]"));
		System.out.println("b".matches("[a-z]"));
		System.out.println("x".matches("[a-z]"));
		System.out.println("z".matches("[a-z]"));
	}
}
