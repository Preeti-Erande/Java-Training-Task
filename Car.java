package AccessModifiers;

public class Car extends Vehicle
{
	public void CallProtected()
	{
		Vehicle obj=new Vehicle();
		obj.ProtectedMethod();
	}

}
