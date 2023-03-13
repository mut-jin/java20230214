package ch09.lecture.p02anonymous;

public class C07Anonymous {
	public static void main(String[] args) {
		MyInterface07 o1 = new MyClass07(); // 인터페이스는 추상개념이니까 객체 생성 불가
		o1.method1();
	}
}

class MyClass07 implements MyInterface07 {
	@Override
	public void method1() {
		System.out.println("재정의된 메소드");
	}
}

interface MyInterface07 {
	void method1();
}