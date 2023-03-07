package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.*;

public class Sub01 extends Super01 {
	
	public void mehtod2() {
		method1(); // 된다
		this.method1();
		super.method1();
	}
	
	public void method3() {
		Super01 o1 = new Super01();
//		o1.method1(); // 다른 패키지여서 안됨
	}
}
