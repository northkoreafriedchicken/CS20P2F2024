package Skillbuilders;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many students are ther in your class?: ");
		int studentnumber = input.nextInt();
		
		String[] individuals = new String[studentnumber];
		String studentname = input.nextLine();;
		
		for (int i = 0; i < studentnumber; i++) {
				System.out.print("What is the name of student " + (i + 1) + "?: ");
				studentname = input.nextLine();
				individuals[i] = studentname;
		}
		
		System.out.println("");
		System.out.println("Student Roster:");
		
		for (String element : individuals) {
			System.out.println(element);
		}

	}

}
