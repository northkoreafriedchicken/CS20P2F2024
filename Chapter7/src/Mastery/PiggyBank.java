package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PiggyBank {

	  public static double quarters, dimes, nickels, pennies, withdrawal, total;
	  public static boolean quit = false;
	  private static final DecimalFormat df = new DecimalFormat("0.00");

	public PiggyBank(int selection) {
		total = (quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01) - withdrawal;
		
		switch(selection) {
		case 0:
			quit = true;
		break;
		case 1:
			System.out.println("$ " + df.format(total));
		break;
		case 2:
			pennies = pennies + 1;
		break;
		case 3:
			nickels = nickels + 1;
		break;
		case 4:
			dimes = dimes + 1;
		break;
		case 5:
			quarters = quarters + 1;
		break;
		case 6:
			Scanner input = new Scanner(System.in);
			System.out.print("How much do you want to withdrawal?: ");
			withdrawal = input.nextDouble();
			if (total < withdrawal) {
				System.out.println("insufficient funds");
				withdrawal = 0;
			}
		break;
		default:
			System.out.println("invalid input");
		break;
		}
		return;
		
	}
	
	static void menu() {
		System.out.println("1. Show total in bank.");
		System.out.println("2. Add a penny.");
		System.out.println("3. Add a nickel.");
		System.out.println("4. Add a dime.");
		System.out.println("5. Add a quarter.");
		System.out.println("6. Take money from the bank.");
		System.out.println("Enter 0 to quit");
	}
	


}

