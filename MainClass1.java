package demo;

public class MainClass1 {

	public static void main(String[] args) 
	{
		// 1. Find class name= ArithmaticOps
		// 2. Create an object of class
		// 3. Using object call method
		ArithmaticOps obj=new ArithmaticOps();
		obj.Add();
		obj.Sub();
		obj.ReadExcelFile();
		
		MethodParameterAndReturn obj1= new MethodParameterAndReturn();
		obj1.Add1(25, 25);
		obj1.Print("Welcome", 100);
		double res = obj1.Mul();
		System.out.println(res);
		
		boolean res1 = obj1.ReturnPrint();
		System.out.println(res1);
		

	}

}
