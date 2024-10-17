package Mastery;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		boolean win = false;
		int secretnum;
		Scanner input = new Scanner(System.in);
		while (win == false) {
			
		secretnum = (int) (20 * Math.random() + 1);
		System.out.print("Enter a number between 1 and 20: ");
		int guess = input.nextInt();
		
		System.out.println("Computer's Number: " + secretnum);
		System.out.println("Player's Number: " + guess);
		
		if (guess == secretnum) {
			System.out.println("You guessed the right number!");
			win = true;
		}
		
		else {
			System.out.println("Better luck next time.");
			System.out.println("");
		}
		}
	}

}
