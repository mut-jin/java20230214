package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		a1.breath();
		
		Horse h1 = (Horse) a1; // animal이 말이 아님, 강제 형변환(type cast) 해야함
		h1.run(); // ok
//		a1.run(); // 안됨 animal에 run이 있는게 아니라서
		
		Animal a2 = new Fish();
		a2.breath();
//		a2.swim(); // 안됨 animal에 swim이 있는게 아니라서
		
		Fish f1 = (Fish) a2; // 강제형변환 (type casting)
		f1.swim(); // ok
	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미호흡한다.");
	}
	
	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}

class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐호흡한다.");
	}
	
	public void run() {
		System.out.println("달립니다.");
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다.");
	}
}