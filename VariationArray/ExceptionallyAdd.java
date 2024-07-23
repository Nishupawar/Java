package VariationArray;

public class ExceptionallyAdd {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] arr = 
		{
			1, 2, 3, 2, 3, 1, 3
		}
		;
		int n=arr.length;
		myCode(arr,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] arr,int n) 
	{
		//write code here	
		//int n = arr.length; 
		System.out.println(getOddOccurrence(arr, n)); 
	}
	static int getOddOccurrence(int arr[], int arr_size) 
	{
		int i; 
		for (i = 0; i < arr_size; i++) 
		{
			int count = 0; 
			for (int j = 0; j < arr_size; j++) 
			{
				if (arr[i] == arr[j]) 
				count++; 
			}
			if (count % 2 != 0) 
			return arr[i]; 
		}
		return -1; 
	}
}
