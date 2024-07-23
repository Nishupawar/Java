package HefShineMap;

import java.util.TreeMap;

public class GetTheGreatestKeyLessThanOrEqualToTheGivenKey {
    public static void main(String[] args) 
	{
		TreeMap<Integer,String> map = new TreeMap <Integer,String> ();
		map.put(9, "Red");
		map.put(23, "Green");
		map.put(15, "tyu");
		map.put(4, "White");
		map.put(51, "sks");
		int key=17;
		myCode(map,key);
	}
	//EndOfMainMethod
	public static void myCode(TreeMap<Integer,String> map,int key) 
	{
		//write code here
		//int f =map.floor(key);
		System.out.print(map.floorKey(key));
	}
}
