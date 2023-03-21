package ch11.lecture.p02try_catch;

public class C02TryCatch {
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 3;
			
			int c = b / a;
			
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		}
		
		System.out.println("continue.....");
	}
}
