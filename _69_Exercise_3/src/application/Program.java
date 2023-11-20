package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Insert the student name");
		student.name = sc.nextLine();
		
		System.out.println("Insert the quarter grades: ");
		student.quarter1 = sc.nextDouble();
		student.quarter2 = sc.nextDouble();
		student.quarter3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));
		
		if (student.passed()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - student.finalGrade());
		}
		
		
		sc.close();
	}

}
