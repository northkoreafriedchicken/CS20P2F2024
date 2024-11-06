package Skillbuilders;

public class Circle {
	public boolean equals(Object c) {
		Circle testObj = (Circle)c;
		if (testObj.getRadius() == radius) {
			return(true);
		} else {
			return(false);
		}
	}
	public String toString() {
		String circleString;
		
		circleString = "Circle has radius " + radius;
		return(circleString);
	}
	  private double radius;

	  public Circle() 
	  {
		  radius = 1.3;
	  }

	  public Circle(double radius) {
	    this.radius = radius;
	  }
	  
	  public static void displayAreaFormula() {
		  System.out.println("The formula for the area of a circle is a=Pi*r*r");
	  }
	  
	  public double getRadius(){
		  return radius;
	  }
	  
	  public void setRadius(double radius) {
	        this.radius = radius;
	    }
	  
	public double circumference() {
		return 2 * radius * Math.PI ;
		
	}
	public double getArea() {
		return Math.PI * radius * radius;
		
	}
	
	
	
}
