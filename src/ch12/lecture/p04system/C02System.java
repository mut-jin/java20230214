package ch12.lecture.p04system;

public class C02System {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long startNano = System.nanoTime();
		
		for(long i = 0; i < 1000_0000_0000L; i++) {
			long r = 3 * i;
		}
		
		long end = System.currentTimeMillis();
		long endNano = System.nanoTime();
		System.out.println(end - start);
		
		System.out.println(endNano - startNano);
	}
}
