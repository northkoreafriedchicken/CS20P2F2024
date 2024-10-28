package Mastery;

import java.util.Scanner;

public class PrimeNumber {
	
    static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;

        for (int inc = 2; inc <= Math.sqrt(num); inc++)
            if (num % inc == 0)
                return false;

        return true;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int prime = input.nextInt();

		if (isPrime(prime)) {
			System.out.println(prime + " is a prime number");
		}
		
		else {
			System.out.println(prime + " is not a prime number");
		}
		
	}

}
