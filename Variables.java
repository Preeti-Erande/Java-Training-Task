package Constructor;

public class Variables 
{
	int a=50;                   //Global Variable
	String newStr="Global Varaible";//Global Variable
	
	// Using this keyword we access the value global variable
	
	
	public void Print()
	{
		int a=10;              //Local variable
		String newStr="Hello";//Local variable
		
		System.out.println(this.newStr); // Global variable
		System.out.println(this.a);      // Global variable
		System.out.println(a);           // Local variable
	}
	
	public void Method(double d1, String str)//Local variable
	{
		System.out.println(d1);  // Local variable
		System.out.println(str); // Local variable
		System.out.println(this.newStr); // Global variable
		System.out.println(a);
	}

}
