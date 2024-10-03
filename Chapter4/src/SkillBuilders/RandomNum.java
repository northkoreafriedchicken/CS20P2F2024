package SkillBuilders;

import java.util.Scanner;

import java.lang.Math;

public class RandomNum {

	public static void main(String[] args) {
		int min, max;
		Scanner input = new Scanner(System.in);
		System.out.print("What is your minimum random number?: ");
		min = input.nextInt();
		System.out.print("What is your maximum random number?: ");
		max = input.nextInt();
		
		System.out.print(
				(int)((max - min + 1) * Math.random() + min));
		
	}

}
