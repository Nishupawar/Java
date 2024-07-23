package VariationArray;

public class BalancedArray {
    public static void main(String[] args) 
	{
		long N = 4;
		int	arr[] = 
		{
			1, 5, 3, 2
		}
		;
		myCode(N, arr);
	}
	//EndOfMainMethod
	public static void myCode(long n, int arr[]) 
	{
		long sum=0;
		for(int i=0;i<n/2;i++)
		{
			sum= sum+arr[i];
		}
		//System.out.println(sum);
		long sum1=0;
		for(int i=arr.length/2;i<n;i++)
		{
			sum1= sum1+arr[i];
		}
		//System.out.println(sum1);
		if(sum>=sum1)
		System.out.println(sum-sum1);
		else
		System.out.println(sum1-sum);
	}
}
