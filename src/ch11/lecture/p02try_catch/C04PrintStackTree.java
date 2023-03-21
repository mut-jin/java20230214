package ch11.lecture.p02try_catch;

public class C04PrintStackTree {
	public static void main(String[] args) {
		// unchecked exception
		try {
			String a = "java";
			System.out.println(a.charAt(4)); // unchecked exception
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		try { // checked exception 이면 무조건 try catch 하게끔 컴파일러가 잡아줌
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}