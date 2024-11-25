package Mastery;

import java.util.Scanner;

public class DigitExtractor {
	
	static String selection;
	static int integer;
	public static boolean quit;
	
	public DigitExtractor() {
		if ("w".equals(selection)) {
			System.out.println("The whole number is " + integer);
		} else if ("o".equals(selection)) {
			System.out.println("The ones place digit is " + (integer % 10));
		} else if ("t".equals(selection)) {
			System.out.println("The tens place digit is " + (integer % 100 / 10));
		}else if ("h".equals(selection)) {
			System.out.println("The hundreds place digit is " + (integer / 100));
		} else if ("q".equals(selection)){
			quit = true;
		}
		else {
			System.out.println("invalid input");
		}
		
	}
	
	static void menu() {
		System.out.println("Show (W)hole number.");
		System.out.println("Show (O)nes place number.");
		System.out.println("Show (T)ens place number.");
		System.out.println("Show (H)undreds place number.");
		System.out.println("(Q)uit");
	}

	

	}
