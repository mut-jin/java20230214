package ch16.lecture.p02lambda;

public class C01Lambda {
	public static void main(String[] args) {
		// functional interface 로 lambda 식 만들 수 있음
		MyInterface01 o1 = () -> System.out.println("재정의 메소드@");
		MyInterface01 o2 = () -> System.out.println("또다른 메소드@");
		o1.method1();
		o2.method1();
	}
}

// Lambda expression
// 추상 메소드가 하나인 interface의 익명 클래스 객체 만드는 코드

// functional interface : 추상 메소드가 하나인 interface

@FunctionalInterface
interface MyInterface01 {
	void method1();
	 
	// Object에 있는 메소드는 추상메소드 수에 포함 안됨
	String toString(); 
	
	default void method2() {
		
	}
	
	static void method3() {
		
	}
}