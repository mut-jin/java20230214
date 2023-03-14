package ch16.exersice.exam07;

public class Example {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	public static void main(String[] args) {
		// 최대값 얻기
		// 스태틱 메소드 참조
//		int max1 = maxOrMin((x, y) -> Math.max(x, y));
		int max1 = maxOrMin(Math::max); 
		int max2 = maxOrMin((x, y) -> (x > y) ? x : y);
		
		int max = maxOrMin((x, y) -> {
			if(x > y) {
				return x;
			} else {
				return y;
			}
		});
		System.out.println("최대값: " + max);
		
		// 최소값 얻기
		// 스태틱 메소드 참조
//		int min1 = maxOrMin((x, y) -> Math.min(x, y));
		int min1 = maxOrMin(Math::min);
		int min2 = maxOrMin((x, y) -> (x > y) ? y : x);
		
		int min = maxOrMin((x, y) -> {
			if(x > y) {
				return y;
			} else {
				return x;
			}
		});
		System.out.println("최소값: " + min);
	}
}
