package ch06.sec10.exam01;

import java.util.Arrays;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
//		Calculator myCalcu = new Calculator();
//		double result1 = 10 * 10 * myCalcu.pi;
//		int result2 = myCalcu.plus(10, 5);
//		int result3 = myCalcu.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		// Arrays.toString
		int[] arr = {51, 22, 33};
		
		System.out.println(Arrays.toString(arr));
	}
}