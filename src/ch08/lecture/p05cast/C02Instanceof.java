package ch08.lecture.p05cast;

public class C02Instanceof {
	public static void main(String[] args) {
		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();
		
		if(o1 instanceof MyClass021) {
			MyClass021 o3 = (MyClass021) o1; // ok			
		}
		if(o2 instanceof MyClass022) {
			MyClass022 o4 = (MyClass022) o2; // ok			
		}
		if(o1 instanceof MyClass022) {
			MyClass022 o5 = (MyClass022) o1; // x			
		}
		
		System.out.println("실행흐름 이어감");
	}
}
