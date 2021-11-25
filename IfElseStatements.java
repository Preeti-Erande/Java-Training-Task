package com.ControlStatements;

public class IfElseStatements
{
	public void ifElseConditions()
	{
	int intNumber1= 40;
	int intNumber2= 200;
	 if(intNumber1>intNumber1)
	 {
		 System.out.println("intNumber1 is greater than intNumber2 ");
	 }
	 else
	 {
		 System.out.println("intNumber2 is greater than intNumber1");
	 }
	 System.out.println("*****************************");
	 
	 //comparison operator:
	 //< > <= >= == !=
	 
	 int intNumber3=40;
	 int intNumber4=80;
	 
	 if(intNumber3==intNumber4)
	 {
		 System.out.println( "intNumber3 and intNumber4 are equal");
	 }
	 else
	 {
		 System.out.println(" intNumber3 and intNumber4  are not equal");
	 }
	 System.out.println("*******************************");
	 
	 //write a logic to find out highest number
	 int intNumbera1= 300;
	 int intNumberb1=500;
	 int intNumberc1=300;
	 
	 //nested if-else
	 
	 if(intNumbera1>intNumberb1 & intNumbera1>intNumberc1)
	 {
		 System.out.println("intNumbera1 is greater");
	 }
	 else if(intNumberb1>intNumbera1 & intNumberb1>intNumberc1)
	 {
		 System.out.println("intNumberb1 is greater");
	 }
	 else if(intNumberc1>intNumbera1 & intNumberc1>intNumberb1)
	 {
		 System.out.println("intNumberc1 is greater");
	 }
	 
	 else
	 {
		 System.out.println("no condition matches");
	 }
	 
	 
	 
	 	
}

}
