package ArrayPrograms;

public class ArrayPrograms
{

	public void AddArray()
	{
		int[] arr=new int[] {10, 20, 30};
		// 10+20+30=60
		int sum =0;
		for(int i=0;i<arr.length;i=i+1)
		{
		sum=sum+arr[i];	
		}
		
		System.out.println(sum);
		
	}
	
	public void AddString()
	{
		String[] strArr=new String[] {"This", "is", "java"};
		// This is java
		String str="";
		for(int i=0;i<strArr.length;i=i+1)
		{
			str= str.concat(strArr[i]+" ");
		}
		System.out.println(str);
	}
}
