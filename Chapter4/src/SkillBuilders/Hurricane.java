package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		int category;
		Scanner input = new Scanner(System.in);
		System.out.print("Select a Hurricane Category (1-5): ");
		category = input.nextInt();
		if (category == 1){
			System.out.print("74-95 mph or 64-82 kt or 119-153 km/hr");
	}
		if (category == 2){
			System.out.print("96-110 mph or 83-95 kt or 154-177 km/hr");
	}
		if (category == 3){
			System.out.print("111-130 mph or 96-113 kt or 178-209 km/hr");
	}
		if (category == 4){
			System.out.print("131-155 mph or 114-135 kt or 210-249 km/hr");
	}
		if (category == 5){
			System.out.print("Greater than 155 mph or 135 kt or 249 km/hr");
	}
		if (category > 5) {
			System.out.print("Not a valid Hurricane Category.");
		}
		if (category < 1) {
			System.out.print("Not a valid Hurricane Category.");
		}
  }
}