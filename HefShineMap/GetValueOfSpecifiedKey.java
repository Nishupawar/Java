package HefShineMap;

import java.util.TreeMap;

public class GetValueOfSpecifiedKey {
    public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(22, "twotwo");
		tm.put(43, "fourtyThree");
		tm.put(1, "one");
		tm.put(9, "nine");
		tm.put(5, "five");
		int key=57;
		myCode(tm,key);
	}
	//EndOfMainMethod
	private static void myCode(TreeMap<Integer, String> tm,int key) 
	{
		//write code here
		System.out.print(tm.get(key));
	}
}
