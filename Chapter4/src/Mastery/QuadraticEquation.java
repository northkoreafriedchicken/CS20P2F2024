package Mastery;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value for a: ");
		double a = input.nextInt();
		
		System.out.print("Enter value for b: ");
		double b = input.nextInt();
		
		System.out.print("Enter value for c: ");
		double c = input.nextInt();
		
		double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a), root2 = (-b + Math.sqrt(Math.pow(b, 2) + (4 * a * c)))/(2*a);
		
		System.out.println("The roots are " + root1 + " and " + root2);
	}

}
