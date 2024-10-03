package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Delivery! What is the size of your package?");
		System.out.println("Length: ");
		double length = input.nextInt();
		System.out.println("Width: ");
		double width = input.nextInt();
		System.out.println("Height: ");
		double height = input.nextInt();
		if (length >= 10 || height >= 10 || width >= 10) {
			System.out.print("Reject");
		}
		else {
			System.out.print("Accept");
		}
	}

}
