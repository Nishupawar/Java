package VariationsArrayList;

import java.util.ArrayList;

public class JoinTwoArrayList {
public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(4);
		list2.add(6);
		list2.add(3);
		list2.add(9);
		list2.add(7);
		ArrayList<Integer> list3=new ArrayList<Integer>();
		myCode(list1,list2,list3);
	}
	//EndOfMainMethod
	public static void myCode(ArrayList<Integer> list1,ArrayList<Integer> list2,ArrayList<Integer> list3) 
	{
		//write code here
		list2.addAll(0,list1);
		list3.addAll(0,list2);
		System.out.println(list3);	
	}
}
