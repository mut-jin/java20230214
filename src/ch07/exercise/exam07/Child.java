package ch07.exercise.exam07;

public class Child extends Parent {
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
//		super();
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
