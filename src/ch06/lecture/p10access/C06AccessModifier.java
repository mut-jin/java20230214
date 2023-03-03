package ch06.lecture.p10access;

public class C06AccessModifier {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		
		// 안됨(MyClass07 은 package private)
//		ch06.lecture.p10access.package1.MyClass07 o2;
	}
}
