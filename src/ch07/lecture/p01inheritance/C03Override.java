package ch07.lecture.p01inheritance;

public class C03Override {
	public static void main(String[] args) {
		SubClass03 o1 = new SubClass03();
		
		o1.method1();
		o1.method2(); // 재정의한 메소드 실행됨
		o1.method3();
	}
}
