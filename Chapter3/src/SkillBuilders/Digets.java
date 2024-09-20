package SkillBuilders;

import java.util.Scanner;

public class Digets {

	public static void main(String[] args) {
		int digets;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a two diget number: ");
		digets = input.nextInt();
		System.out.print("The number in the ones-place is ");
		System.out.println(digets % 10);
		System.out.print("The number in the tens-place is ");
		System.out.println(digets / 10);
	}

}
