package Mastery;

public class Food {

	private double price, fat, carbs, fiber;
	
	//Constructor method does not have a return value
	public  Food(double p, double f, double ca, double fi) 
	{
		price = p;
		fat = f;
		carbs = ca;
		fiber = fi;
	}
	
	public double showPrice()
	{
		return price;
	}
	public double showFat()
	{
		return fat;
	}
	public double showCarbs()
	{
		return carbs;
	}
	public double showFiber()
	{
		return fiber;
	}
}
