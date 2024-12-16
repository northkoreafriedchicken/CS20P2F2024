package Mastery;

import java.util.Scanner;

public class GradeBook {
	 	private int[][] grades;
	 	
		public GradeBook(int numStudents, int numGrades) 
		{
			
			grades = new int[numStudents][numGrades];
	 	}
	 	
		public void getGrades() {
			Scanner input = new Scanner(System.in);
			int stuGrade;
			
			for (int stu = 0; stu < grades.length; stu++) {
				for (int grade = 0; grade < grades[0].length; grade++) {
					System.out.print("Enter test score " + (grade + 1) + " for student " + (stu + 1) + ": ");
					stuGrade = input.nextInt();
					grades[stu][grade] = stuGrade;
					
				}
			}

		}
	
		public void showGrades() {
			System.out.println("");
			for (int stu = 0; stu < grades.length; stu++) {
				for (int grade = 0; grade < grades[0].length; grade++) {
					System.out.println("Student " + (stu + 1) + " grade on test " + (grade + 1) + " is " + grades[stu][grade]);
					
				}
			}
		}
		public void studentAvg() {
			int Avggrade = 0, stu, grade;
			System.out.println("");
			for (stu = 0; stu < grades.length; stu++) {
				Avggrade = 0;
				for (grade = 0; grade < grades[0].length; grade++) {
					Avggrade = Avggrade + grades[stu][grade];		
				}
				Avggrade = Avggrade / (grades.length + 1);
				System.out.println("Student " + (stu + 1) + " average grade is " + Avggrade);
			}
			
		}
		public void testAvg() {
			int Avggrade = 0, stu = 0, grade = 0;
			System.out.println("");
			for (grade = 0; grade < grades[0].length; grade++) {
				Avggrade = 0;
				for (stu = 0; stu < grades.length; stu++) {
					Avggrade = Avggrade + grades[stu][grade];		
				}
				Avggrade = Avggrade / (stu);
				System.out.println("test " + (grade + 1) + " average grade is " + Avggrade);
			}
			
		}
		
}
