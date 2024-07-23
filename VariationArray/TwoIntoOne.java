package VariationArray;

public class TwoIntoOne {
    public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,2,3,4
			}
			,
			{
				4,5,6,4
			}
			,
			{
				4,5,6,4
			}
			,
			{
				7,8,9,5
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[][] a) 
	{
		//write code here or  logic
		int[] b= new int[a.length*a.length];
		int index =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[index++]=a[i][j];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
