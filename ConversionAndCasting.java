package com.vstl;

public class ConversionAndCasting {

	
	
		public void wideningtypeCasting()
		{
		//widening Type casting
		byte byteNumber=10;
		//automaticly converts byte type to short type
		short shrtNumber=byteNumber;
		int intAge=shrtNumber;
		long longNumber=intAge;
		float floatNumber=longNumber;
		double doubleNumber=floatNumber;
		System.out.println("Before Conversion,  byte value " +byteNumber);
		System.out.println("After Conversion, short value  " +shrtNumber);
		System.out.println("After Conversion, int value " +intAge);
		System.out.println("After Conversion, long value " +floatNumber);
		System.out.println("After Conversion, double value " +doubleNumber);
		
		System.out.println("***********************************************");
		
		
		}
		public void conversionMethods()
		{//String to int using parseint method()
			String strNumber="100";
			int intNumber = Integer.parseInt(strNumber);
			System.out.println("value of string to int : "+intNumber);
			
		// using Integer.value of method()
			String strNumber1="20";
			Integer intNewNumber = Integer.valueOf(strNumber1);
			System.out.println("value of String to integer is : "+intNewNumber);
			
		//String to long
			String strMobileNumber="5559999999";
			long longMobileNumer = Long.parseLong(strMobileNumber);
			System.out.println("value of string to long is "+longMobileNumer);
			
	  // long to string
			long longNumber=5677778880L;
			String strNewNumber = String.valueOf(longNumber);
			String strLongToString = Long.toString(longNumber);
			
			System.out.println("value of long to string is "+strNewNumber);
			System.out.println("value of long to string using Long.method "+strLongToString);
			
			
			
		}

	}


