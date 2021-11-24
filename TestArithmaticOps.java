package com.vstl;

public class TestArithmaticOps {

	public static void main(String[] args)
	{
		ArithmaticOps objArithmaticOps=new ArithmaticOps();
		objArithmaticOps.doAddition();
		objArithmaticOps.doSubstraction(88.90, 34.45);
		
		int intReturnResult=objArithmaticOps.doMultiplication();
		System.out.println("Multiplication is : "+intReturnResult);
		System.out.println("*********************");
		
       //getText:
		String strNumber="40";
		int intNumber = Integer.parseInt(strNumber);
		System.out.println("Value of Number is : "+intNumber);
		
		
		
	}

}
