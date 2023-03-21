package ch11.lecture.p02try_catch;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			
			int c = b / a;
			
			System.out.println("try block continue....");
		} catch (ArithmeticException e1) {
			// catch block
//			System.out.println("예외발생!!!!!");
			e1.printStackTrace(); // 예외 힌트 출력, 문제가 무엇인지 알기 위해서 작성하는 것이 좋음
		}
		System.out.println("program continue....");
	}
}
