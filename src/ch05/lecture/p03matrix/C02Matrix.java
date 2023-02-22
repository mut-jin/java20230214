package ch05.lecture.p03matrix;

public class C02Matrix {
	public static void main(String[] args) {
		int[][] mat = new int[3][4];
		
		System.out.println(mat.length); // 3행
		System.out.println(mat[0].length);
		System.out.println(mat[1].length);
		System.out.println(mat[2].length);
		System.out.println(mat[3].length);
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j]);
			}
		}
		
		//각 원소에 값 할당
		mat[0][0] = 3;
		mat[0][1] = 5;
		mat[0][2] = 7;
		mat[0][3] = 9;
		
		// ......
		mat[1][2] = 10;
		mat[2][2] = 20;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j]);
			}
		}
	}
}
