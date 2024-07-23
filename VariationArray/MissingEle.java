package VariationArray;

public class MissingEle {
    public static void main(String[] args) 
	{
		int[] a={1,2,3,5};
		int n=4;
		
		int n1 = a.length + 1; 
		int totalSum = (n1 * (n1 + 1)) / 2; 
		int sum = 0; 
		for (int num : a)
		{
			sum =sum+ num;
		}
		int ele = totalSum - sum;
		System.out.println(ele);
	}
}
