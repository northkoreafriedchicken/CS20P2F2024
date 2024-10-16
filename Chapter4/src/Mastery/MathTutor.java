package Mastery;

import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstnum = (int) (6 * Math.random() + 1), secondnum = (int) (6 * Math.random() + 1), 
			operator = (int) (4 * Math.random() + 1), guess = 0, answer = 0;
		
		if (operator == 1){
			System.out.print("What is " + firstnum + " + " + secondnum + "? ");
			answer = firstnum + secondnum;
			guess = input.nextInt();
		}
		if (operator == 2){
			System.out.print("What is " + firstnum + " - " + secondnum + "? ");
			answer = firstnum - secondnum;
			guess = input.nextInt();
		}
		if (operator == 3){
			System.out.print("What is " + firstnum + " * " + secondnum + "? ");
			answer = firstnum * secondnum;
			guess = input.nextInt();
		}
		if (operator == 4){
			System.out.print("(Without decimals) " + "What is " + firstnum + " / " + secondnum + "? ");
			answer = firstnum / secondnum;
			guess = input.nextInt();
		}
		if (answer == guess) {
			System.out.print("Correct!");
		}
		else {
			System.out.print("Wrong. The correct answer is: " + answer);
		}
	}

}
