package VariationArray;

public class SumOfDiagonalEle {
    	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				5,1,3,
			}
			,
			{
				2,4,3
			}
			,
			{
				4,3,2
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		//WriteCode Here
		int sum=0;
		int cnt=0;
		//first diagonal
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(j+i==a.length-1)
				{
					//System.out.print(a[i][j]+" ");
					sum=sum+a[i][j]; 
					cnt++;                  
				}
			}
			//System.out.println();
		}
		System.out.println(sum);
	}
}
