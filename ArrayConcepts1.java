package com.Arrays;

public class ArrayConcepts1 
{
		
		public void arrayTypes()
		{
 
		
			// array: to store similar data type values in a array variable
			
			//1. int array:
			// Lowest bound/index=0;
			//upper bound/index = n-1 (n is size of array
			// one dimensional array
			
			
			 int [] intArr = new int[4];
			 intArr[0] = 10;
			 intArr[1] = 20;
			 intArr[2]= 30;
			 intArr[3] = 40;
			 
			 System.out.println("Value of int array is " +intArr[2]);
			 System.out.println("Value of int array is " +intArr[3]);
			 
			// System.out.println(intArr[4]);// ArrayIndexOutOfBoundException
			 
			 System.out.println("Length of int array is :" +intArr.length);//size/length of array
			 
			 //Print all the values of array: use for loop
			 for(int i = 0; i<intArr.length;i=i+1)
			 {
				 System.out.println("Value of all elements of int array is " +intArr[i]);
			 }
			 System.out.println("--------------------------------------------------");
			 //2. double array:
			 double [] doubleArray = new double[3];
			 doubleArray[0] = 66.90;
			 doubleArray[1] = 55.88;
			 doubleArray[2] = 34.90;
			  
			 System.out.println("value of double array is :" +doubleArray[2]);
			 System.out.println("-------------------------------------------------------");
			 
			 // 3. character array;
			 char[] charAraay= new char[3];
			 charAraay[0] = 'a';
			 charAraay[1] = 'b';
			 charAraay[2] = 'c';
			  
			 System.out.println("Value of char aaray is : "+charAraay[1]);
			 System.out.println("--------------------------------------------------");
			 
			 // 4. boolean array:
			 boolean [] booleanArray= new boolean[2];
			 booleanArray[0] = true;
			 booleanArray[1] = false;
			 
			 System.out.println("Value os boolean Array is : "+booleanArray[1]);
			 System.out.println("--------------------------------------------------");
			 
			 
			 // 5. String array:
			 String [] strArray= new String[3];
			 strArray[0] = "Hello";
			 strArray[1] = "Welcome";
			 strArray[2] = "Bye";
			 
			 System.out.println("Length of string array is : "+strArray.length);
			 System.out.println("Value of string array is ; "+strArray[1]);

		}

	}



