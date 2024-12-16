package Skillbuilders;

public class Reverse {

	public static void main(String[] args) {
		int countdownnumber = 10;
		int[] countdown = new int[countdownnumber + 1];
		for (int i = (countdown.length - 1); i != -1; i--) {
			countdown[i] = i;
			System.out.println(countdown[i]);
		}
	}

}
