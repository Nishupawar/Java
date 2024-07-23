package VariationArray;

public class FaceOfTournment {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			4, 5, 7, 6, 9, 10, 14
		}
		;
		int n=3;
		int m=2;
		myCode(a,n,m);
	}
	//EndOfMainMethod
	public static void myCode(int[] arr,int n,int m) 
	{
		// write code here
		int ramWins = 0;
		int rohanWins = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % m == 0) 
			{
				ramWins++;
			}
			if (arr[i] % n == 0) 
			{
				rohanWins++;
			}
		}
		if (ramWins > rohanWins) 
		{
			System.out.println("Ram");
		}
		else if (ramWins < rohanWins) 
		{
			System.out.println("Rohan");
		}
		else 
		{
			System.out.println("Both");
		}
	}
}
