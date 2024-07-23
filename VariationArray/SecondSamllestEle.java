package VariationArray;

public class SecondSamllestEle {
    public static void main(String[] args) 
	{
		int a[]=
		{
			1,2,5,6,3,2
		}
		;  
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a)
	{
		int min=Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secMin =min;
				min=a[i];
			}
			if(a[i]<secMin && a[i]!=min)
			secMin= a[i];
		}
		System.out.print(secMin);
	}
}
