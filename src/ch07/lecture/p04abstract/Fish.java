package ch07.lecture.p04abstract;

public class Fish extends Animal{

	// 만약 추상메소드를 재정의하지 않으면
	// abstract 클래스로 정의해주어야 함
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉼");
	}
}
