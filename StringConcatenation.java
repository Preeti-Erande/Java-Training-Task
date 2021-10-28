package demo;

public class StringConcatenation 
{ 
	//adding of multiple string with integers with data types
	
	public static void main(String[] args)
	{
		
	int a=100;
	int b=200;
	
	double d1=66.11;
	double d2=90.0;
	
	String x="Hello";
	String y="World";
	
	System.out.println(a+b);  // + sign is concatenation operator
	System.out.println(x+y);
	
	System.out.println(a+b+x+y);
	
	System.out.println(x+y+a+b);
	
	System.out.println(x+y+(a+b));
	
	System.out.println(a+b+x+y+a+x+b+y);
	
	System.out.println(a+b+x+y+a+b);
	
	System.out.println(d1+d2);
	
	System.out.println(x+y+d1+d2);
	
	System.out.println("the value of a is:"+a);
	
	System.out.println("the value of a and b is:" +(a+b));
	
	// difference between syso.out.println and syso.out.print
	// println = is used to print on the console with a new line
	// print = is just used to print on the console
	
	System.out.print("Hello Selenium");
	System.out.println("Hello Testing");
	
	
	
   
	
	
	}

	
			

}
