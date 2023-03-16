package ch15.exersice.exam10;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		
		Student student2 = new Student("blue", 96);
		Student student3 = new Student("hong", 86);
		Student student4 = new Student("white", 92);
		
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		
		student2.compareTo(student3);
		student4.compareTo(student3);
		student4.compareTo(student2);
		student3.compareTo(student2);
		
		
		Student student = treeSet.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
		
	}

}
