package Skillbuilders;

public class TestCircle 
{
	public static void main(String[] args) {
		Circle spot = new Circle();
		spot.setRadius(5);
		System.out.println("Circle Radius: " + spot.getRadius());
		System.out.println("Circle Area: " + spot.getArea());
		System.out.println("Circle circumference: " + spot.circumference());
		
		Circle.displayAreaFormula();
		System.out.println("");
		System.out.println(spot.toString());
		
		if (spot.equals(spot) == true) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("Objects are not equal.");
		}
	}


}
