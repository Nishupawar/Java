package VariationsArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RepeatedIDS {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			8, 8, 6, 2, 1
		}
		;
		int n=a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		ArrayList<Integer> al = new ArrayList<>();
		for(int b:a)
		{
			al.add(b);
		}
		LinkedHashSet<Integer>  l= new LinkedHashSet<>(al);
		System.out.print(l);
	}
}
