package Mastery;

import java.util.Scanner;

public class MySavings {

	public static void main(String[] args) {
		while (PiggyBank.quit == false) {
			Scanner input = new Scanner(System.in);
			PiggyBank.menu();
			System.out.print("Enter your choice: ");
			int selection = input.nextInt();
			PiggyBank piggybank = new PiggyBank(selection);
			System.out.println(" ");
		}
	}

}

/*
Screen dump 1:
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money from the bank.
Enter 0 to quit
Enter your choice: 6
How much do you want to withdrawal?: 3
insufficient funds
 
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money from the bank.
Enter 0 to quit
Enter your choice: 1
$ 0.0
 
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money from the bank.
Enter 0 to quit
Enter your choice: 0

Screen Dump 2:

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money from the bank.
Enter 0 to quit
Enter your choice: 5
 
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money from the bank.
Enter 0 to quit
Enter your choice: 4
 
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money from the bank.
Enter 0 to quit
Enter your choice: 6
How much do you want to withdrawal?: 0.03
 
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money from the bank.
Enter 0 to quit
Enter your choice: 1
$ 0.32
 
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money from the bank.
Enter 0 to quit
Enter your choice: 0
*/