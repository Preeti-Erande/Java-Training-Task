package com.vstl;

public class Variables {
	//Declaring Static Variables
	static String strEmpName="Preeti";
	static int intEmpAge=25;
	static long longEmpMobileNumber=788890876;
	
	public void LocalVariable()
	{
		//Declaring Local Variables
		boolean blnFlag=true;
		System.out.println(blnFlag);
		
		char charLetter='P';
		System.out.println(charLetter);
		
		double dblTemperature=26.8;
		System.out.println(dblTemperature);
		
	}

	public static void main(String[] args) 
	{
		//Declaring Instance Variable
		System.out.println("*********Instance Variables**********");
		float floatValue=34.90f;
		System.out.println("float value is : "+floatValue);
		byte byteMaxValue=127;
		System.out.println("byte Max Value is : "+byteMaxValue);
		
		//Accessing Static variables  inside main method
		//1. Accessing Local Variables by using class name
		System.out.println("*****Static Variables**********");
		System.out.println(Variables.longEmpMobileNumber);
		System.out.println(Variables.strEmpName);
		System.out.println(Variables.intEmpAge);
		
		//2. Accessing Directly
		System.out.println(longEmpMobileNumber);
		System.out.println(strEmpName);
		System.out.println(intEmpAge);
		
		// Accessing Local Variables by object creation
		
		System.out.println("*****Local Variables***********");
		
		Variables objVariables=new Variables();
		objVariables.LocalVariable();
		
		
		
		
		


	}

}
