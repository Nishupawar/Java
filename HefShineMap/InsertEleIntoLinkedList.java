package HefShineMap;

import java.util.LinkedList;

public class InsertEleIntoLinkedList {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		int ele=100;
		System.out.println(list1);
		myCode(list1,ele);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1,int ele) 
	{
		//write code here
		//System.out.println(list1);
		list1.add(ele);
		System.out.println(list1);
	}
}
