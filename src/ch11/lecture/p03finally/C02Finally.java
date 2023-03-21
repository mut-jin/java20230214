package ch11.lecture.p03finally;

public class C02Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			
			if (a) {
				return;
			}
			System.out.println("try block..");
		} catch (NullPointerException e) {
			System.out.println("exception block...");
		} finally {
			System.out.println("finally block"); // return으로 종료되어도 finally는 실행
		}
		System.out.println("continue...");
	}
}
