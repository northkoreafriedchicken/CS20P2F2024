package Skillbuilders;

public class TextRectangle {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		rect1.setlength(5);
		rect1.setwidth(3);
		rect2.setlength(2);
		rect2.setwidth(3);
	
		System.out.println("Rectangle 1 Perimiter: " + rect1.perimiter());
		System.out.println(rect1.toString());
		System.out.println("");
		System.out.println("Rectangle 2 Perimiter: " + rect2.perimiter());
		System.out.println(rect2.toString());
		System.out.println("");
		
		Rectangle.displayAreaFormula();
		if (rect1.equals(rect2) == true) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("Objects are not equal.");
		}


	}

}
