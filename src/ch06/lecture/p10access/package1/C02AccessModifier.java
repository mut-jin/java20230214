package ch06.lecture.p10access.package1;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		System.out.println(o1.name); // 접근 가능
//		System.out.println(o1.age); // 접근 불가능
		System.out.println(o1.married); // 접근 가능
		
		o1.method1(); // 접근 가능
//		o1.method2(); // 접근 불가능
		o1.method3(); // 접근 가능
	}
}
