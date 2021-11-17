package Interface;


interface I2
{
	public int Engine(int speed, int power);
	int a=50;
	

}
public class Bike implements I1, I2
{

	public void Accelerate()
	{
		System.out.println("Bike accelerate");
		System.out.println(I1.a);
		System.out.println(I2.a);
		
	}
	public void Brake()
	{
	System.out.println("Bike brake");	
	}
	public int Engine(int speed, int power)
	{
		int distance= speed * power;
		
		return distance;
	}
}
