package Constructor;

public class ConstructorClass 
{
	// 1. Method name= class name
	// 2. No return type
	public  ConstructorClass(int a, String str) // Parameterized constructor
	{
		System.out.println("Constructor calling....");
		System.out.println(a);
		System.out.println(str);
	}
	
	// Default Constructor
	public ConstructorClass()
	{
		
	}

}
