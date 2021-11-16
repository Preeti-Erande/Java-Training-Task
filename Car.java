package Inheritance;


// Car: child class, Vehicle: Base class
public class Car extends Vehicle
{
	public Car(int a)
	{
		super(100); //call vehicle constructor
		System.out.println("Car Constructor");
		System.out.println(a);
				
				
	}
	

}
