package baekJoon.conditional;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
//		int alarmM = (M-45);
//		
//		if(H==0 && alarmM<0) {
//			System.out.print(23);
//			System.out.print(" ");
//			System.out.print(60+alarmM);
//		} else if(H!=0 && alarmM<0) {
//			System.out.print(H-1);
//			System.out.print(" ");
//			System.out.print(60+alarmM);
//		} else if(H!=0 && alarmM>=0) {
//			System.out.print(H);
//			System.out.print(" ");
//			System.out.print(alarmM);
//		} else if(H==0 && alarmM>=0) {
//			System.out.print(H);
//			System.out.print(" ");
//			System.out.print(alarmM);
//		}
		
		if(M < 45) {
			H--;
			M= 60 - (45-M);
			if(H<0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}
}