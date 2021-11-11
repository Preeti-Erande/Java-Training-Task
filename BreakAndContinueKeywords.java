package ArrayPrograms;

public class BreakAndContinueKeywords {

	public static void main(String[] args) 
	{
		// break keyword:
		int[] arr=new int[] {10,20,30,40,50};
		for(int i=0;i<arr.length;i=i+1)
		{
			if(i==3)
			{
				break;
			}
			System.out.println(arr[i]);
		}
		
		System.out.println("***********************");
		
		
		// continue keyword
		int[] arr1= new int[]{10,20,30,40,50};
		for(int i=0;i<arr1.length;i=i+1)
		{
			if(i==2)
			{
				continue;
			}
			System.out.println(arr[i]);
		}
		
	}
	
	

}
