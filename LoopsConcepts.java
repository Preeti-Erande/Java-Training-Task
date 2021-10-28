package demo;

public class LoopsConcepts
{
	public static void main(String[] args)
	{
		// 1. while loop:
		//print 1 to 10
		// dis-advantage of while loop
		//if you dont give incremental part then while loop will generate it will give infinite loops
		
		int i=1;  //initialization
		while(i<=10) // conditional part
		{
			System.out.println(i);
			i=i+1; //incremental /decremental part
		}
		
		System.out.println("***********");
		
	// j++ means j+j+1

		
		// 2. for loop
		//print 1 to 10
		for(int j=1;j<=10;j=j+1)
		{
			System.out.println(j);
		}
		
		//print 10 to 1
		for (int k=10;k>=1;k--)
		{
			System.out.println(k);
		}
		
		
	}

	
}
