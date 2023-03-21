package ch11.lecture.p04throw;

public class C04Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
	
	public static void method1() throws RuntimeException { // unchecked exception은 써도 되고 안써도 됨
		throw new RuntimeException();
	}
}
