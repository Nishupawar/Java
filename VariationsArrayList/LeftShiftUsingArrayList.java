package VariationsArrayList;

import java.util.ArrayList;

public class LeftShiftUsingArrayList {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5,6
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[] a) 
	{
		//write code here
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		
		ArrayList<Integer> a1= new ArrayList<>();
		for(int b:a)
		{
			a1.add(b);
		}
		System.out.println(a1);
	}
}
