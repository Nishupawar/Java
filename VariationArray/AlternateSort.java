package VariationArray;

import java.util.Arrays;

public class AlternateSort {
    public static void main(String[] args) 
	{
		int arr[] = 
		{
			7, 1, 2, 3, 4,5, 6
		}
		;
		int n = arr.length;
		myCode(arr,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] arr,int n) 
	{
		alternateSort(arr, n);
	}
	static void alternateSort(int arr[], int n)
	{
		Arrays.sort(arr);
		int i = 0, j = n-1;
		while (i < j) 
		{
			System.out.print(arr[j--] + " ");
			System.out.print(arr[i++] + " ");
		}
		if (n % 2 != 0)
		System.out.print(arr[i]);
	}
}
