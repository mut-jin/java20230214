package ch11.exercise.exam05;

public class Exam05 {
	

	
	static void method2() {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //catch (ClassNotFoundException e) {  // Unreachable catch block 
//			
//		}
	}
	
	
	public static void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
}
