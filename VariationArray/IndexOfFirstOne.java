package VariationArray;

public class IndexOfFirstOne {
    public static void main(String[] args) 
	{
		int arr[] = 
		{
			0, 0, 0, 0, 0, 0, 1, 1, 1, 1
		}
		;
		myCode(arr);
	}
	//EndOfMainMethod
	public static void myCode(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
