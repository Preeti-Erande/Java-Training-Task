package Interface;

interface I3
{
	public void M1();
	}

interface I4
{
	public void M1();
	
	}


public class MultipleInheritance implements I3,I4
{
	public void M1()
	{
		System.out.println("Single implementation of method M1");
	}
	

}
