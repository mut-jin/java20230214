package ch07.sec03exam02;

public class SmartPhone extends Phone {
	// 생성자 선언
	public SmartPhone(String model, String color) {
//		super(); 생략하면 자동으로 들어감 맨 마지막에는 쓸 수 없음
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
