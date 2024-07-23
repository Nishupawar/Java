package VariationArray;

public class DiffBetweenMinMAx {
    public static void main(String[] args) 
	{
		int[] a=
		{
			11,22,33,44,55
		}
		;
		diff(a);
	}
	//EndOfMainMethod
	private static void diff(int[] a) 
	{
		//code here
		int min=Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			max=a[i];
			if(a[i]<min)
			min=a[i];
		}
		System.out.println("max "+max);
		System.out.println("min "+min);
		System.out.println(max-min);
	}
}
