package HefShineMap;

import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SearchValueInTreMap {
    private static Set<Entry<Integer, String>> entrySet;
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> map = new TreeMap <Integer,String> ();
		map.put(19, "Red");
		map.put(2, "Green");
		map.put(13, "tyu");
		map.put(4, "White");
		map.put(57, "sks");
		String value="ak"; 
		myCode(map,value);
	}
	//EndOfMainMethod
	public static void myCode(TreeMap<Integer,String> map,String value) 
	{
		//write code here
		System.out.print(map.containsValue(value));
	}
}