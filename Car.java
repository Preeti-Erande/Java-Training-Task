package Interface;

//Rule:
//1. We can only define method
//2. If we implement interface in class then
// all the method defined in interface has to be implemented
// 3. We cannot change the value of variable defined inside interface
// 4. Default access modifier of a method defined in interface is public
// 5. We cannot create an object of an interface but we can create reference
interface I1
{
	public void Accelerate();
	public void Brake();
	int a=10;
}

public class Car implements I1
{
	public void Accelerate()
	{
	System.out.println("Car accelerate");	
	}
	
	public void Brake()
	{
		System.out.println("Car brake");
	}

}
