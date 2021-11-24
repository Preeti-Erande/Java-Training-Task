package com.Arrays;

public class ArrayExample 
{
	public void printArray()
	{//1.Initializing array with passing fix value in [] bracket  
		int [] intArray= new int [5];
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
		
		// To get iterate in array we need to write for loop
		for(int i=0;i<intArray.length;i=i+1)
		{
			System.out.println("Value of array is : "+intArray[i]);
			System.out.println("**************************************");
		}
		
		//2.Initailizing array without passing fix value
		
		int [] intArr = new int[]{10,20,40,60,80};
		for(int i=0;i<intArr.length;i=i+1)
		{
			System.out.println(intArr[i]);
		}
		
		System.out.println("##################################");
		
		//3.Initialize and assign values together
		int[] intArrNumbers={22,33,44,55,66};
		
		for(int i=0;i<intArrNumbers.length;i=i+1)
		{
			System.out.println(intArrNumbers[i]);
		}
		
		
		
	}

}
