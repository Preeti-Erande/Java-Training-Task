package Constructor;

public class ConstructorUse 
{
	// What is the use of constructor?
	//. At run time or at the time of object creation we assign some value to Global Variable in a constructor
	
	int a;
	String str;
	
	public ConstructorUse(int a, String str)
	{
		this.a =a; // we have assigned local variable value to global variable during run time or object creation
		this.str=str;
	}
	
	public void Print()
	{
		System.out.println(a);
		System.out.println(str);
	}
	
	public void Add()
	{
		int c=a+10;
		System.out.println(c);
	}

}
