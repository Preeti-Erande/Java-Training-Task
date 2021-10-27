package demo;

public class MainClass {
	//public = access modifier publicly available anywhere
	//MainClass = Class Name
	

	public static void main(String[] args) 
	{
		System.out.println("Hello java");
		
		// Primitive Data types : int, char, double, boolean
		
		// 1. int:
		int a=10;
		a=20;
		int b= 20;
		int c= a+b;
		System.out.println(c); 
		
		//2. double:
		double d1= 44.890;
		double d2= 66.990;
		double d3= d1+d2;
		System.out.println(d3);
		double d4= 100;
		System.out.println(d4);//100.00
		
		//3. char: only single digit value, should be written in single quotes
		
		char c1= 'x';
		char c2= 'Y';
		char c3= '1';
		char c4= '$';
		System.out.println(c4);
		
		//4. boolean
		boolean b1= true;
		boolean b2= false;
		
		//String: is a class, not adata type
		String str= "Hello World";
		String str1= " Hi this is my java code";
		System.out.println(str1);
		String str2= "1000";
		String str3= "@#679i";
		
				
		
		
		
		
		
		
		
		
		

	}

}
