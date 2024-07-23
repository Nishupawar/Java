package HefShineMap;

import java.util.TreeMap;

public class CopyTreeMApIntoAnotherTreeMap {
    public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(21, "twoOne");
		tm.put(4, "four");
		tm.put(15, "fifteen");
		tm.put(3, "three");
		tm.put(7, "seven");
		TreeMap<Integer, String> tm2=new TreeMap<Integer, String>();
		myCode(tm,tm2);
	}
	//EndOfMainMethod
	private static void myCode(TreeMap<Integer, String> tm,TreeMap<Integer, String> tm2) 
	{
		//write code here
		tm2.putAll(tm);
		System.out.println(tm2);
	}
}
