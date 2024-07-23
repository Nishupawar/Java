package HefShineMap;

import java.util.LinkedList;

public class ChevkPArticularEleIsExist {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(42);
		list1.add(16);
		list1.add(33);
		list1.add(94);
		list1.add(87);
		int ele=94;
		myCode(list1,ele);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1,int ele) 
	{
		//write code here
		if (list1.contains(ele)) 
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
	}
}
