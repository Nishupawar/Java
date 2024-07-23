package VariationArray;

public class Nthseries {
    public static void main(String[] args) 
	{
		int n = 4;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=(i*i)+(i*i*i);
		}
		System.out.print(sum);
		
	}

}
