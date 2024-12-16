package Mastery;

public class EvenAndOdds {

	public static void main(String[] args) {
		int[] oddevensort = new int[25];
		
		int randnum = 0;
		
		System.out.println("ODD:");
		for(int i = 0; i < oddevensort.length; i++) {
			randnum = (int) (99 * Math.random());
			oddevensort[i] = randnum;
			if (oddevensort[i] % 2 == 1) {
				System.out.print(oddevensort[i] + " ");
			}
		}
		System.out.println("");
		System.out.println("Even:");
		for(int i = 0; i < oddevensort.length; i++) {
			randnum = (int) (99 * Math.random());
			oddevensort[i] = randnum;
			if (oddevensort[i] % 2 == 0) {
				System.out.print(oddevensort[i] + " ");
			}
		}
	}

}
/*
SCREENDUMP #1:
ODD:
59 33 3 91 67 77 57 33 77 
Even:
8 44 90 54 78 10 48 68 52 60 
SCREENDUMP #2
ODD:
31 45 15 27 93 49 19 89 49 37 25 
Even:
92 48 24 46 60 84 36 46 84 4 58 18 48 82 42 
*/