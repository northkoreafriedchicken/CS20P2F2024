package Skillbuilders;

public class Squares {

	public static void main(String[] args) {
		int[] squares = new int[5];
		System.out.println("Squares from 0 to " + (squares.length - 1));
		for (int i = 0; i < squares.length; i++) {
			squares[i] = i;
			System.out.println(squares[i]);
		}

	}

}
