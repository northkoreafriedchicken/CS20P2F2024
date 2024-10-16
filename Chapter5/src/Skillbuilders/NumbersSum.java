package Skillbuilders;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int max = input.nextInt();
		int num = 0;
		int sum = 0;
		while (num < max) {
			num = num + 1;
			System.out.println(num);
			sum = num + sum;
		}
		System.out.print("The total sum is " + sum);
	}

}
