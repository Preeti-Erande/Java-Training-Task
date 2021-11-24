package com.vstl;

public class TestArithmaticOpsClass1 
{   //global / Instance 
	static ArithmaticOps objArithmatic=new ArithmaticOps();
	
	static int intReturnValue=70;

	public static void main(String[] args) 
	{
		objArithmatic.doAddition();
		
		objArithmatic.doSubstraction(66.90, 34.00);
		
	intReturnValue =	objArithmatic.Print(intReturnValue);
	System.out.println("Return value is : "+intReturnValue);

	}

}
