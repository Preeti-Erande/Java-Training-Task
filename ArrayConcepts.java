package demo;

public class ArrayConcepts {

	public static void main(String[] args) 
	{
		// array: to store similar data type values in a array variable
		
		//1. int array:
		// Lowest bound/index=0;
		//upper bound/index = n-1 (n is size of array
		// one dimensional array
		
		
		 int[] arr=new int[4];
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2]= 30;
		 arr[3] = 40;
		 
		 System.out.println(arr[2]);
		 System.out.println(arr[3]);
		 
		// System.out.println(arr[4]);// ArrayIndexOutOfBoundException
		 
		 System.out.println(arr.length);//size/length of array
		 
		 //Print all the values of array: use for loop
		 for(int i = 0; i<arr.length;i=i+1)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 //2. double array:
		 double [] d=new double[3];
		 d[0] = 66.90;
		 d[1] = 55.88;
		 d[2] = 34.90;
		  
		 System.out.println(d[2]);
		 
		 // 3. character array;
		 char[] c= new char[3];
		 c[0] = 'a';
		 c[1] = 'b';
		 c[2] = 'c';
		  
		 System.out.println(c[1]);
		 
		 // 4. boolean array:
		 boolean [] b= new boolean[2];
		 b[0] = true;
		 b[1] = false;
		 
		 // 5. String array:
		 String [] str= new String[3];
		 str[0] = "Hello";
		 str[1] = "Welcome";
		 str[2] = "Bye";
		 
		 System.out.println(str.length);
		 System.out.println(str[1]);

	}

}
