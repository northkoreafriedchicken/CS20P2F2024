package Mastery;

import java.util.Scanner;

public class DigitMastery {

	public static void main(String[] args) {
		int digets;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three diget number: ");
		digets = input.nextInt();
		
		System.out.print("The number in the hundreds-place is ");
		System.out.println(digets / 100);
		
		System.out.print("The number in the tens-place is ");
		System.out.println(digets % 100 / 10);
		
		System.out.print("The number in the ones-place is ");
		System.out.println(digets % 10);
	}
}
