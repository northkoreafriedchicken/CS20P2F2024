package Skillbuilders;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Minutes 2. Hours 3. Days ");
		System.out.print("What do you want to convert it from?: ");
		int timetype1 = input.nextInt();
		String timetypestr = "Minutes";
		if (timetype1 == 2){
			timetypestr = "Hours";
		}
		if (timetype1 == 3){
			timetypestr = "Days";
		}
		System.out.println(" ");
		
		System.out.print("What is the number of " + timetypestr + "?: ");
		int num1 = input.nextInt();
		
		System.out.println(" ");
		
		System.out.println("1. Minutes 2. Hours 3. Days ");
		System.out.print("What do you want to convert it to?: ");
		int timetype2 = input.nextInt();
		
		String timetypestr2 = "Minutes";
		if (timetype2 == 2){
			timetypestr2 = "Hours";
		}
		if (timetype2 == 3){
			timetypestr2 = "Days";
		}
		int conversion = num1;
			if (timetype2 == 2) {
				conversion = num1 / 60;
			}else if (timetype2 == 3) {
				conversion = num1 / 1440;
		}
		if (timetype1 == 2){
			if (timetype2 == 1) {
				conversion = num1 * 60;
			}else if (timetype2 == 3) {
				conversion = num1 / 24;
			}else {
				conversion = num1;
			}
		}
		if (timetype1 == 3){
			if (timetype2 == 1) {
				conversion = num1 * 1440;
			}else if (timetype2 == 2) {
				conversion = num1 * 24;
			}else {
				conversion = num1;
			}
		}
		System.out.println(num1 + " " + timetypestr + " is " + conversion + " " + timetypestr2 + ".");
		
	}

}
