package ch08.lecture.p01interface.p02abstract_method;

// 구현클래스(구체클래스. concrete class)
public class MyClass01 implements MyInterface01 {
	
	@Override
	public void method1() {
		System.out.println("구현된 메소드");
	}
	
	public void method2() {
		System.out.println("추가된 메소드");
	}
}
