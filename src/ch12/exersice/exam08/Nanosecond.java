package ch12.exersice.exam08;

public class Nanosecond {
	public static void main(String[] args) {
		long startNano = System.nanoTime();
		int[] scores = new int[1000];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		long endNano = System.nanoTime();
		System.out.println(avg);
		System.out.println(endNano - startNano);
	}
}
