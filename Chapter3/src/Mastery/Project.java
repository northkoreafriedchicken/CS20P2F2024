package Mastery;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		double designing = 0;
		double coding = 0;
		double debugging = 0;
		double testing = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Designing: ");
		designing = input.nextInt();

		System.out.print("Coding: ");
		coding = input.nextInt();
		
		System.out.print("Debugging: ");
		debugging = input.nextInt();
		
		System.out.print("Testing: ");
		testing = input.nextInt();
		
		System.out.println("");
		System.out.println("Task           % Time");
		double total = designing + coding + debugging + testing;
		
		designing = (designing / total * 100);
		designing = Math.round(designing * 100);
		designing = designing/100;
		System.out.println("Designing      " + designing + " %");
		
		coding = (coding / total * 100);
		coding = Math.round(coding * 100);
		coding = coding/100;
		System.out.println("Coding         " + coding + " %");
		
		debugging = (debugging / total * 100);
		debugging = Math.round(debugging * 100);
		debugging = debugging/100;
		System.out.println("Debugging      " + debugging + " %");
		
		testing = (testing / total * 100);
		testing = Math.round(testing * 100);
		testing = testing/100;
		System.out.println("Testing        " + testing + " %");
	}

}
