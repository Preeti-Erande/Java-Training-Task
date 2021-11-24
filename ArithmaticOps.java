package com.vstl;

public class ArithmaticOps
{
	public void doAddition()
	{
		//LocalVariables
		int intNumber_1=20, intNumber_2=30;
		int intTotal=intNumber_1+intNumber_2;
		System.out.println("Addition is : "+intTotal);
		
		System.out.println("***************************************");
		
	}
	// To make method more generic we declare Parameterized method
	public void doSubstraction(double dblNumber_1,double dblNumber_2)
	{
		double dblTotal=dblNumber_1-dblNumber_2;
		System.out.println("Substraction is : "+dblTotal);
		System.out.println("***************************");
	}
	
	// Method return type
	public int doMultiplication( )
	{
		int intNumber_A1=50, intNumber_A2=20;
	
		int intResult=intNumber_A1*intNumber_A2;
		return intResult;
	}
	
	public int Print(int intNumber)
	{
		return intNumber;
	}
}
	



