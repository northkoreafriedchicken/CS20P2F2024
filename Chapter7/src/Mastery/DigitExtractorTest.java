package Mastery;

import java.util.Scanner;

public class DigitExtractorTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter and integer: ");
		DigitExtractor.integer = input.nextInt();
		while (DigitExtractor.quit == false) {
			DigitExtractor.menu();
			Scanner input1 = new Scanner(System.in);
			System.out.print("Enter your choice: ");
			DigitExtractor.selection = input1.nextLine();
			DigitExtractor.DigitExtractor();
			System.out.println(" ");
		}

	}
}
/*
Screen Dump 1:
Enter and integer: 123
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is 1
 
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: o
The ones place digit is 3
 
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: q

Screen Dump 2:
Enter and integer: 486
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: t
The tens place digit is 8
 
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: q
*/