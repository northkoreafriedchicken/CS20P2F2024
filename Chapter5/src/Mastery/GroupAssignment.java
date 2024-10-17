package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstname = input.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastname = input.nextLine();
		
		String lastnamecap = lastname.toUpperCase();
		char initial = lastnamecap.charAt(0);
		int alph = (int)initial;
		int group = 0;
		
		if (alph >= 65 && alph <= 73) {
			group = 1;
		}
		
		if (alph >= 74 && alph <= 83) {
			group = 2;
		}
		
		if (alph >= 84 && alph <= 90) {
			group = 3;
		}
		
		System.out.println(firstname + " " + lastname + " is assigned to Group " + group);
	}

}
