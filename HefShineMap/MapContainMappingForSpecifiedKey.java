package HefShineMap;

import java.util.TreeMap;

public class MapContainMappingForSpecifiedKey {
    public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(2, "two");
		tm.put(4, "four");
		tm.put(1, "one");
		tm.put(3, "three");
		tm.put(5, "five");
		int key=5;
		myCode(tm,key);
	}
	//EndOfMainMethod
	private static void myCode(TreeMap<Integer, String> tm,int key) 
	{
		//write code here
		//Set<Integer> keySet = tm.keySet();
		System.out.print(tm.containsKey(key));
	}
}
