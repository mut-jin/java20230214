package ch05.exercise;

public class Example08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int num = 0;
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			num += array[i].length;
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println(num);
		System.out.println(sum);
		
		double avg = (double) sum / num;
		System.out.println(avg);
	}
}