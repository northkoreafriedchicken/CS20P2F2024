package Mastery;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		
		System.out.println(" ");
		System.out.println("Convert: ");
		System.out.println("1. Inches to Centimeters	5. Centimeters to Inches");
		System.out.println("2. Feet to Centimeters		6. Centimeters to Feet");
		System.out.println("3. Yards to Meters		7. Meters to Yards");
		System.out.println("4. Miles to Kilometers		8. Kilometers to Miles");
		System.out.println(" ");
		
		System.out.print("Enter your choice: ");
		int measurment = input.nextInt();
		System.out.println(" ");
		
		double conversion = 0;
		String measure1 = "";
		String measure2 = "";
		
		switch(measurment) {
		case 1:
			conversion = num1 * 2.54;
			measure1 = "inches";
			measure2 = "centimeters";
			break;
		case 2:
			conversion = num1 * 30;
			measure1 = "feet";
			measure2 = "centimeters";
			break;
		case 3:
			conversion = num1 * 0.91;
			measure1 = "yards";
			measure2 = "meters";
			break;
		case 4:
			conversion = num1 * 1.6;
			measure1 = "miles";
			measure2 = "kiloimeters";
			break;
		case 5:
			conversion = num1 / 2.54;
			measure2 = "inches";
			measure1 = "centimeters";
			break;
		case 6:
			conversion = num1 / 30;
			measure2 = "feet";
			measure1 = "centimeters";
			break;
		case 7:
			conversion = num1 / 0.91;
			measure2 = "yards";
			measure1 = "meters";
			break;
		case 8:
			conversion = num1 / 1.6;
			measure2 = "miles";
			measure1 = "kiloimeters";
			break;
		default:
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println(num1 + " " + measure1 + " equals " + conversion + " " + measure2 + ".");
	}

}
