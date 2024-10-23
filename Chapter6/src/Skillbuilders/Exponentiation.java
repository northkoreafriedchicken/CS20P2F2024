package Skillbuilders;

import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
		int num1 = input.nextInt();
		System.out.print("To the power of: ");
		int num2 = input.nextInt();
		System.out.println(Math.pow(num1, num2));
	}

}
