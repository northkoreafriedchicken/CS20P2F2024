package Skillbuilders;

public class Rectangle {
	public boolean equals(Object r) {
		Rectangle testObj = (Rectangle)r;
		if (testObj.getArea() == length * width) {
			return(true);
		} else {
			return(false);
		}
	}
	public String toString() {
		String rectangleString;
		rectangleString = "Rectangle has area " + (length * width);
		return(rectangleString);
	}
	private double length, width;
	
	public Rectangle() {
		length = 5;
		width = 6;
	}
	
	  public void setlength(double length) {
	        this.length = length;
	    }
	  public void setwidth(double width) {
	        this.width = width;
	    }
	  public static void displayAreaFormula(){
		  System.out.println("The formula for area of a rectangle is a=width*height");
	  }
	  public double getArea(){
		  return width * length;
	  }
	  
	  public double perimiter(){
		  return (width * 2) + (length * 2);
	  }
	
}
