package LogicalPrograms;

public class LogicPractice {

	
		public void PrintEvenNumber()
		{
			int[] arr= new int[] {12, 13, 14, 15, 16, 17,6,9};
			// 12 14 16 6
			
			for(int i=0;i<arr.length;i=i+1)
			{
				if(arr[i]%2==0)
				{
					System.out.println(arr[i]);
				}
			}
		}

		public void PrintOddNumbers()
		{
			int[] arr=new int[] {1,2,3,5,7,9,0,66,88,34};
			
			for(int i=0;i<arr.length;i=i+1)
			{
				if(arr[i]%2!=0)
				{
					System.out.println(arr[i]);
				}
			}
		}

		public void PrintCountOf0()
		{
			int [] arr= new int[] {1,8,0,5,0,3,0,7,2,8,0,5};
			
			int count=0;
			
			for(int i=0;i<arr.length;i=i+1)
			{
				if(arr[i]==0)
				{
					count=count+1;
				}
			}
			System.out.println(count);
		}
		
		public void VerifyPrime()
		{
			int a=7;
			// verify 8 is prime number or not
			boolean isprime=true;
			
			for(int i=2;i<a-1;i=i+1)
			{
				int remainder=a%i;
				if(remainder==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime==true)
			{
				System.out.println(a+ " is a prime number");
			}
			else
			{
				System.out.println(a+ " is not a prime number");
			}
		}
	
		public void SortArrayAscending()
		{
			int[] arr= new int[] {4,9,5,8,1,0};
			int temp= 0;
			
			System.out.println("Elements of original array");
			for(int i=0;i<arr.length;i=i+1)
			{
				System.out.print(arr[i]+ " ");
			}
			
		
			for(int i=0;i<arr.length;i=i+1)
			{
				for(int j=i+1;j<arr.length;j=j+1)
				{
					if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			}
			System.out.println();
			System.out.println("Elements of  sorted array");
			for(int i=0;i<arr.length;i=i+1)
			{
				System.out.print(arr[i]+" ");
			}
			
			
			
		}

		
		public void ReverseString()
		{
			String str= "This is demo";
			// omed si siht
			char[] arr = str.toCharArray();
			String newstr=" ";
			for(int i=arr.length-1;i>=0;i=i-1)
			{
				newstr=newstr+arr[i];
				
			}
			System.out.println(newstr);
					
		}
}
