package com.vstl;

public class ObjectCreation {
	
	
	public void printEmpNameAndAge()
	{
		System.out.println("Employee Name - Preeti");
		System.out.println("Employee Age - 25");
	}

	public static void main(String[] args) 
	{
		//1. How to create object of class
		// ClassName objname= new ClassName();
		
		ObjectCreation objObjectCreation=new ObjectCreation();
		objObjectCreation.printEmpNameAndAge();

	}

}
