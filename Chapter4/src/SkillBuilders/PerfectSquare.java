package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Perfect square calculater. Input a number: ");
		double square = input.nextInt();
		double answer = Math.sqrt(square), answernodec = (int)answer, decimal = answer - answernodec;
		if (decimal == 0){
			System.out.print("Your number is a perfect square!");
		}
		else {
			System.out.print("Your number is not a perfect square.");
		}
	}

}
