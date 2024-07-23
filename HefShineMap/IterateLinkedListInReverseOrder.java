package HefShineMap;

import java.util.LinkedList;
import java.util.Iterator;
public class IterateLinkedListInReverseOrder {
    public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		myCode(list1);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1) 
	{
		//write code here
		Iterator<Integer> list11=list1.descendingIterator();
		while(list11.hasNext())
		{
			System.out.println(list11.next());
		}
	}
}