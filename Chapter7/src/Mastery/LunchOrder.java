package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LunchOrder {
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		Food hamburger = new Food(1.85, 9, 33, 1);
		Food salad = new Food(2, 1, 11, 5);
		Food fries = new Food(1.30, 11, 36, 4);
		Food soda = new Food(0.95, 0, 38, 0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of hamburgers: ");
		int hamburgeramount = input.nextInt();
		System.out.println("Each hamburger has " + hamburger.showFat() + "g of fat, " + hamburger.showCarbs() + "g of carbs, and " + hamburger.showFiber() + "g of fiber.");
		System.out.println("");
		
		System.out.print("Enter number of salads: ");
		int saladamount = input.nextInt();
		System.out.println("Each salad has " + salad.showFat() + "g of fat, " + salad.showCarbs() + "g of carbs, and " + salad.showFiber() + "g of fiber.");
		System.out.println("");
		
		System.out.print("Enter number of fries: ");
		int friesamount = input.nextInt();
		System.out.println("French fries have " + fries.showFat() + "g of fat, " + fries.showCarbs() + "g of carbs, and " + fries.showFiber() + "g of fiber.");
		System.out.println("");
		
		System.out.print("Enter number of sodas: ");
		int sodaamount = input.nextInt();
		System.out.println("Each soda has " + soda.showFat() + "g of fat, " + soda.showCarbs() + "g of carbs, and " + soda.showFiber() + "g of fiber.");
		System.out.println("");
		
		double total = (hamburger.showPrice() * hamburgeramount + salad.showPrice() * saladamount + fries.showPrice() * friesamount + soda.showPrice() * sodaamount);
		System.out.println("Your order comes to: $" + df.format(total));
	}


}
/* Screen dump 1:
Enter number of hamburgers: 3
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.

Enter number of salads: 4
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.

Enter number of fries: 2
French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.

Enter number of sodas: 5
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.

Your order comes to: $20.90

Screen Dump 2:

Enter number of hamburgers: 545634
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.

Enter number of salads: 235344523
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.

Enter number of fries: 
3
French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.

Enter number of sodas: 45
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.

Your order comes to: $471698515.55
*/
