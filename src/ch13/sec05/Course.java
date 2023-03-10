package ch13.sec05;

public class Course {
	//모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}
	
	//학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student>applicant) {
		Student a = applicant.kind; // 안전하게 사용 가능
		Person p = applicant.kind; // 안전하게 사용 가능
		Object o = applicant.kind; // 안전
		
//		MiddleStudent m = applicant.kind// 안전하지 않음
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2를 등록함");
	}
	
	//직장 및 일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		
		// out
		applicant.kind = new Worker(); // 안전
		applicant.kind = new SubWorker(); // 안전
		applicant.kind = new SubWorker(); // 안전
		
//		applicant.kind = new Person(); // 안전하지 않음
		
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
}

class SubWorker extends Worker {}
class SubWorker2 extends Worker {}
