package ch11.lecture.p04throw;

public class C05Throw {
	public static void main(String[] args) {
		
	}
	
	public static void method2() throws Throwable {
		throw new ClassNotFoundException();
	}
	
	public static void method1() throws RuntimeException {
		throw new ClassCastException();
	}
}
