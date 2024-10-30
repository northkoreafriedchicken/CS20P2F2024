package Mastery;

import java.util.Scanner;

public class AddCoins {

	static String getDollarAmount(double quarters, double dimes, double nickels, double pennies) {
		String total = "$" + (quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01);
		return total;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your total coins:");
		System.out.println(" ");
		
		System.out.print("Quarters: ");
		double quarters = input.nextInt();
		
		System.out.print("Dimes: ");
		double dimes = input.nextInt();
		
		System.out.print("Nickels: ");
		double nickels = input.nextInt();
		
		System.out.print("Pennies: ");
		double pennies = input.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Total: " + getDollarAmount(quarters, dimes, nickels, pennies));
	}

}
