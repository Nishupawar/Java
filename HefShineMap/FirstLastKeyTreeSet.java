package HefShineMap;

import java.util.TreeSet;

public class FirstLastKeyTreeSet {
    public static void main(String[] args) 
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(82);
		set.add(6);
		set.add(12);
		set.add(94);
		set.add(6);
		myCode(set);
	}
	//EndOfMainMethod
	public static void myCode(TreeSet<Integer> set) 
	{
		//write code here
		System.out.println("first Element : "+set.first());
		System.out.print("Last Element : "+set.last());
	}
}
