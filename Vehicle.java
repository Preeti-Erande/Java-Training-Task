package AccessModifiers;

public class Vehicle // private, default, public
{
	
	public Vehicle() // private, default, protected, public
	{
		
	}
	
	
	
	
	//private->default->protected->public
	
	
	// Scope of private method is limited to the same class
	private void PrivateMethod()
	{
		System.out.println("Inside private method");
	}
	
	public void CallPrivateMethod()
	{
		Vehicle obj=new Vehicle();
		obj.PrivateMethod();
	}
	
	//Scope will be in same class and inherited class
	// Also scope of protected method is outside a package using this.
	protected void ProtectedMethod()
	{
		System.out.println("Inside protected method");
	}
	
	//scope of default method is limited only in the same package not outside the package
	void DefaultMethod()
	{
		System.out.println("Inside default method");
	}
	}


