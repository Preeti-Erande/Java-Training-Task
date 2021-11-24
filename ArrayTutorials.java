package com.Arrays;

import javax.naming.ldap.StartTlsResponse;

public class ArrayTutorials 
{
	public void printNumbers()
	{
		int [] intArray1= new int [1000];
		for(int i=0;i<intArray1.length-1;i=i+1)
		{
			intArray1 [i] = i+1;
			System.out.println(intArray1[i]);
		}
	}
	
	public void addArray()
	{
		int [] intAddArr = new int []{10, 20, 30};
		// 10+20+30=60
		int sum=0;
		for(int i=0;i<intAddArr.length;i=i+1)
		{
			sum=sum+intAddArr[i];
			
		}
		System.out.println(sum);
	}
	
	public void addString()
	{
		String[] strArray = new String [] {"This", "is", "Java"};
		// This is Java
		String strNew=" ";
		for(int i=0;i<strArray.length;i=i+1)
		{
			strNew=strNew+strArray[i]+" ";
		}
		System.out.println(strNew);
	}

}
