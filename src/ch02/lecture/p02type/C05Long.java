package ch02.lecture.p02type;

public class C05Long {
	public static void main(String[] args) {
		// long
		// (8 bytes, 64 bits)
		
		long l1 = 2147483647; // 0
		l1 = 2147483648L; // int 영역 벗어난 long 타입은 끝에 (L) 붙임
		l1 = 999932322992392321L;
		l1 = -99223232199111911L;
		
		l1 = 99_9932_3229_9239_2321L;
		l1 = -99_223_232_199_111_911L;
	}
}
