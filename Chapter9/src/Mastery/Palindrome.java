package Mastery;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
	
		int simularity = 0, r = -1;
		boolean space = false;
		word = word.toLowerCase().replaceAll("\\W", "");
		char palindrome[] = new char[word.length()];
		int palinlength = palindrome.length;
		char reversearray[] = new char[word.length()];
		for (int i = palindrome.length - 1; i > -1; i--) {
			space = false;
			r++;
			if (Character.isLetterOrDigit(word.charAt(r))) {
				palindrome[r] = word.charAt(r);
	        } else {
	        	palinlength--;
	        	space = true;
	        }
			if (Character.isLetterOrDigit(word.charAt(i))) {
				reversearray[i] = word.charAt(i);
	        }
				
			if (palindrome[i] == reversearray[r] && space == false) {
				simularity++;
			}
		}
		if (simularity == palinlength) {
			System.out.println("This is a palindrome.");
		} else {
			System.out.println("This is not a palindrome.");
		}
	}

}
/*
SCREENDUMP #1:
Enter a word: never odd or even
This is a palindrome.
SCREENDUMP #2:
Enter a word: not a palindrome
This is not a palindrome.
*/
