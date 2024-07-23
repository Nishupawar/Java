package HefShineMap;

import java.util.LinkedList;

public class RetrieveButDoNotRemove {
    public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(14);
		list1.add(63);
		list1.add(32);
		list1.add(39);
		list1.add(7);
		
		myCode(list1);
	}
	//EndOfMainMethod

public static void myCode(LinkedList<Integer> list1) 
{
	//write code here
	System.out.println(list1.peekFirst());
	System.out.println(list1);
}
}
