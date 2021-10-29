package demo;

public class MethodParameterAndReturn 
{
	//Method Parameter - the no. of parameter define in method should be equal while calling method 
	//with equal sequence
	
	public void Add1(int a, int b)// 2 method parameter with int data type
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void Print(String str, int a)
	{
		System.out.println(str);
		System.out.println(a);
	}
	//Method return type :
	// 1. return from method
	
	public double Mul()
	{
		double d1=34.232;
		double d2=23.998;
		double d3=d1*d2;
		return d3;
	}
	
	public boolean ReturnPrint()
	{
		boolean a= false;
		int x=33;
		int y=40;
		int z= x-y;
		return a;
		
	}
	

}
