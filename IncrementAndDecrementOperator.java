package demo;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) 
	{
	//++
    //--
		int i=1;
		int j=i++; //Post increment
		
		System.out.println(i);
		System.out.println(j);
		
		int a=2;
		int b= ++a; //Pre increment
		
		System.out.println(a);
		System.out.println(b);
		
		int m=2;
		int n=m--; // post decrement
		
		System.out.println(m);
		System.out.println(n);
		
		int p=3;
		int q= --p; // pre decrement
		
		System.out.println(p);
		System.out.println(q);

	}

}
