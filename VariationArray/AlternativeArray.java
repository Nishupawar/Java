package VariationArray;
import java.util.*;
public class AlternativeArray {
    //StartOfMainMethod
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
		Arrays.sort(arr);
		int left = 0, right = n - 1;
		int[] result = new int[n];
		int i = 0;
		while (left <= right) 
		{
			if (left != right) 
			{
				result[i++] = arr[right]; 
			}
			result[i++] = arr[left]; 
			left++;
			right--;
		}
		for (int num : result) 
		{
			System.out.print(num + " ");
		}
	}
}
