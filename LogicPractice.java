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
		
		
	

}
