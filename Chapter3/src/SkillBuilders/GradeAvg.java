package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		System.out.println("Grade Average Calculator");
		int grade1;
		int grade2;
		int grade3;
		int grade4;
		int grade5;
		int average = 0;
		System.out.print("What is your first grade?: ");
		Scanner input1 = new Scanner(System.in);
		grade1 = input1.nextInt();
		average += grade1;
		System.out.print("What is your second grade?: ");
		Scanner input2 = new Scanner(System.in);
		grade2 = input2.nextInt();
		average += grade2;
		System.out.print("What is your third grade?: ");
		Scanner input3 = new Scanner(System.in);
		grade3 = input3.nextInt();
		average += grade3;
		System.out.print("What is your forth grade?: ");
		Scanner input4 = new Scanner(System.in);
		grade4 = input4.nextInt();
		average += grade4;
		System.out.print("What is your fifth grade?: ");
		Scanner input5 = new Scanner(System.in);
		grade5 = input5.nextInt();
		average += grade5;
		average /= 5;
		System.out.print("Your grade average is ");
		System.out.print(average);
		System.out.print("%");
	}

}
