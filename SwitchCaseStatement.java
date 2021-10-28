package demo;

public class SwitchCaseStatement 
{
	public static void main(String[] args)
	{
		String str = "Welcome";
		//str=Welcome
		//str= Hi
		//str= Hello
		//str=Bye
		
		switch(str)
		{
		case "Hi" :
			System.out.println(str+ " is equal to Hi");
			break;
			
		case "Welcome" :
			System.out.println(str+ " is eual to Welcome");
			break;
		case "HEllo" :
			System.out.println(str+ " is equal to Hello");
			break;
		case "Bye" :
			System.out.println(str+ "is equal to Bye");
			break;
			default :
				System.out.println("No condition matches");
				break;
		
		}
			
	}

}
