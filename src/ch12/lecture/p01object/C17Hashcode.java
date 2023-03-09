package ch12.lecture.p01object;

public class C17Hashcode {
	public static void main(String[] args) {
		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		int h3 = o3.hashCode();
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}
