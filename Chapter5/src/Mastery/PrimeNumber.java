package Mastery;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int divider = 1;
		Boolean primable = false;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int prime = input.nextInt();
		
		while (divider < prime) {
			divider = divider + 1;
			if (prime % divider == 0) {
				if (prime != divider) {
					System.out.println(prime + " can be divided by " + divider);	
					primable = true;
				}
			}
		}
		
		if (primable == true) {
			System.out.println(prime + " is not a prime number");
		}
		
		else {
			System.out.println(prime + " is a prime number");
		}
		
	}

}
