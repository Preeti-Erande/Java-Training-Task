package StringOperations;

public class Operations
{
	public void FindLength()
	{
		String str = "This is java";
		int result = str.length();
		System.out.println(result);
		
	}
	
	public void PrintLongestString(String str1, String str2)
	{
		int length1 = str1.length();
		int length2 = str2.length();
		
		if(length1>length2)
		{
			System.out.println(str1+ " is the longest String");
		}
		else
		{
			System.out.println(str2+ " is the longest String");
		}
		
	}

	public void Compare()
	{ // 1. .equals method is case sensitive (string should be exactly equal with case)
	 // 2.  .equalsIgnoreCase is not case sensitive 
	 //	3. == will compare the reference & .equals will compare the value
		
		String str = "Hello";
		boolean res = str.equals("Demo");
		System.out.println(res);
		
		boolean res1 = str.equalsIgnoreCase("HELLO");
		System.out.println(res1);
		
	}
	
	public void VerifyContains()
	{
		// .contains is case sensitive method
		
		String str = "This is java";
		boolean res = str.contains("Java");
		System.out.println(res);
		
	}
	
	public void VerifyContainsIgnoreCase()
	{
		String str="This is java";
		String str1="JAVA";
		
		String res1 = str.toLowerCase(); // this is java
		String res2 = str1.toLowerCase(); // java
		
		boolean result = res1.contains(res2);
		System.out.println(result);
		
	}

	public void FindIndex()
	{
		String str = "Tax return.pdf";
		int index = str.lastIndexOf(".");
		System.out.println(index);
	}
	
	public void FindString()
	{
		String str= "This is java";
		String res = str.substring(5);
		System.out.println(res);
		String res1 = str.substring(5, 7);
		System.out.println(res1);
	}
	
	public void FindFileExtension(String str)
	{
		int index = str.lastIndexOf(".");
		String extension = str.substring(index);
		System.out.println(extension);
	}
	
	public void SplitString()
	{
		String str = "Tax return.pdf";
		String [] arr = str.split("\\.");
		for(int i=0; i<arr.length;i=i+1)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public void FindCountOfCharacter()
	{
		String str= "Hello Java";
		int count=0;
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i=i+1)
		{
			if(arr[i]=='e')
			{
				count=count+1;
			}
		}
		System.out.println(count);
		
	}
	
	public void CountCharacterUsingSplit()
	{
		String str="Hello Welcome";
		 String[] arr = str.split("l");
		 int count = arr.length-1;
		 System.out.println(count);
	}
	
	
}
