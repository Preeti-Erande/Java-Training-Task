package com.ControlStatements;

public class SwitchCaseStatemets 
{
	public void switchcaseMethod1()
	{
		String strEmpNamre = "Vivek";
		//str=Welcome
		//str= Hi
		//str= Hello
		//str=Bye
		
		switch(strEmpNamre)
		{
		case "Hi" :
			System.out.println(strEmpNamre+ " is equal to Hi");
			break;
			
		case "Welcome" :
			System.out.println(strEmpNamre+ " is eual to Welcome");
			break;
		case "HEllo" :
			System.out.println(strEmpNamre+ " is equal to Hello");
			break;
		case "Bye" :
			System.out.println(strEmpNamre+ "is equal to Bye");
			break;
			default :
				System.out.println("No condition matches");
				break;
		
	}
		
	}
	
}
