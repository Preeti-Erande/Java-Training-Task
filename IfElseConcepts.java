package demo;

public class IfElseConcepts {

	public static void main(String[] args)
	{
		int a= 40;
		int b= 200;
		 if(a>b)
		 {
			 System.out.println("a is greater than b");
		 }
		 else
		 {
			 System.out.println("b is greater than a");
		 }
		 
		 //comparison operator:
		 //< > <= >= == !=
		 
		 int c=40;
		 int d=80;
		 
		 if(c==d)
		 {
			 System.out.println("c and d are equal");
		 }
		 else
		 {
			 System.out.println("c and d are not equal");
		 }
		 
		 //write a logic to find out highest number
		 int a1= 300;
		 int b1=500;
		 int c1=300;
		 
		 //nested if-else
		 
		 if(a1>b1 & a1>c1)
		 {
			 System.out.println("a1 is greater");
		 }
		 else if(b1>a1 & b1>c1)
		 {
			 System.out.println("b1 is greater");
		 }
		 else if(c1>a1 & c1>b1)
		 {
			 System.out.println("c1 is greater");
		 }
		 
		 else
		 {
			 System.out.println("no condition matches");
		 }
		 
		 
		 
		 	
	}

}
