package AccessModifiers;

public class MainClass {

	public static void main(String[] args)
	{
		Vehicle obj=new Vehicle();
		
		Car obj1=new Car();
		obj1.ProtectedMethod();
		obj1.CallProtected();
		

	}

}
