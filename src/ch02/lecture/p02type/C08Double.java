package ch02.lecture.p02type;

public class C08Double {
	public static void main(String[] args) {
		// 실수
		// float(4 bytes), double(8 bytes)
		
		int i1 = 3;
//		i1 = 3.14;
		
		double d1 = 3.14;
		d1 = 99.9999;
		d1 = 3;
		d1 = 99;
		
		float f1 = 3.14F; // F, f 끝문자로 float literal 표현
		f1 = 3;
		
		// 사용시 주의
		// 10진법 -> 2진법 으로 바꿔서 저장
		//
		double d2 = 0.1; // 0.000110011001100110011001100
		double d3 = 0.2; // 0.001100110011001100110011001
		
		double d4 = d2 + d3;
		
		System.out.println(d4); // double 타입 계산이 근사값으로 이루어지기 때문에 결과도 근사값 저장
	}
}
