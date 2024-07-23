package HefShineMap;

import java.util.HashMap;
import java.util.Set;

public class SetViewOfAlllKey {
    public static void main(String[] args) 
	{
		//[1, 33, 2, 51, 40]
		HashMap<Integer,String> map = new HashMap <Integer,String> ();
		  map.put(1, "Red");
		  map.put(2, "Green");
		  map.put(33, "Black");
		  map.put(40, "White");
		  map.put(51, "Blue");
	
		myCode(map);
	}
	//EndOfMainMethod

	public static void myCode(HashMap<Integer,String> map) 
	{
		//write code here
		Set<Integer> keySet= map.keySet();
		System.out.println(keySet);
	}
}
