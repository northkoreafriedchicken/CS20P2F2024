package Mastery;

import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		int AwbreyNY, MartinezNY, AwbreyNJ, MartinezNJ, AwbreyCT, MartinezCT;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Election Results for New York: ");
		System.out.print("Awbrey: ");
		AwbreyNY = input.nextInt();
		System.out.print("Martinez: ");
		MartinezNY = input.nextInt();
		
		System.out.println("");
		
		System.out.println("Election Results for New Jersey: ");
		System.out.print("Awbrey: ");
		AwbreyNJ = input.nextInt();
		System.out.print("Martinez: ");
		MartinezNJ = input.nextInt();
		
		System.out.println("");
		
		System.out.println("Election Results for Connecticut: ");
		System.out.print("Awbrey: ");
		AwbreyCT = input.nextInt();
		System.out.print("Martinez: ");
		MartinezCT = input.nextInt();
		
		System.out.println("");
		
		int AwbreyTotal = AwbreyNY + AwbreyNJ + AwbreyCT;
		int MartinezTotal = MartinezNY + MartinezNJ + MartinezCT;
		double TotalVotes = MartinezTotal + AwbreyTotal;
		double AwbreyPercent = AwbreyTotal / TotalVotes * 100;
		double MartinezPercent = MartinezTotal / TotalVotes * 100;
		
		AwbreyPercent = Math.round(AwbreyPercent * 100);
		AwbreyPercent = AwbreyPercent/100;
		MartinezPercent = Math.round(MartinezPercent * 100);
		MartinezPercent = MartinezPercent/100;
		int totalint = MartinezTotal + AwbreyTotal;
		
		System.out.println("Candidate       Votes Percentage");
		System.out.println("Awbrey            " + AwbreyTotal + "      " + AwbreyPercent + (" %"));
		System.out.println("Martinez          " + MartinezTotal + "      " + MartinezPercent + (" %"));
		System.out.println("TOTAL VOTES:      " + totalint);
	}

}
