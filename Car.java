package Overloading;

public class Car 
{
	// Construtor overloading
	public Car()
	{
		System.out.println("0 parameter");
	}
	
	public Car(int a)
	{
		System.out.println("! parameter");
	}
	
	
	
	
	//Rule:
	//1. Method name should be same
	//2. Change in method parameter either in number or in data type
	public void CalculateSpeed()
	{
		System.out.println("Car speed is 60kmph");
	}
	
	public void CalculateSpeed(int distance)
	{
		int speed=distance/60;
		System.out.println(speed);
	}

	public void CalculateSpeed(int distance, int time)
	{
		int speed=distance/time;
		System.out.println(speed);
	}
}
