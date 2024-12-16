package Skillbuilders;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Enter a word: ");
		word = input.nextLine();
		word = word.toLowerCase().replaceAll("\\W", "");
		word = word.replaceAll("[0-9]", "");
		char wordLetters[] = new char[word.length()];
		System.out.print("There are " + wordLetters.length + " letters in this phrase.");

	}

}
