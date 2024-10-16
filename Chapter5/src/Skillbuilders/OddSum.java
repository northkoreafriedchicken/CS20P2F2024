package Skillbuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int max = input.nextInt();
		int num = 0;
		int sum = 0;
		while (num < max) {
			num = num + 1;
			System.out.println(num);
			if (num % 2 != 0) {
				sum = num + sum;
			}
		}
		System.out.print("The total sum of the odd numbers is " + sum);
	}

}
