package HefShineMap;

import java.util.HashSet;

public class CloneHashSet {
    public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		HashSet<Integer> hs2=new HashSet<Integer>();
		System.out.println(hs);
		myCode(hs,hs2);
	}
	//EndOfMainMethod
	@SuppressWarnings("unchecked")
	public static void myCode(HashSet<Integer> hs,HashSet<Integer> hs2) 
	{
		//write code here
		hs2.addAll(hs);
		System.out.println(hs2);
	}
}
