package DynamicCollection;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Collection 
{
	public void DemoArrayList()
	{
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("hi");
		arrList.add("Welcome");
		arrList.add("Java");
		
		System.out.println(arrList.size());
       String value= arrList.get(2);
       System.out.println(value);
       for( String xyz   : arrList   )
       {
    	  System.out.println(xyz); 
       }
       
       
       
       
	}

	public void Verify()
	{
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		// Verify 30 is present or not
		
		for(  Integer number : arrList )
		{
			if(number==30)
			{
				System.out.println("30 is Present");
			}
		}
		
		boolean result=arrList.contains(30);
		System.out.println(result);
		
	}

}
