package HefShineMap;

import java.util.HashMap;

public class MApContainsValue {
    public static void main(String[] args) 
	{

		HashMap<Integer,String> map = new HashMap <Integer,String> ();
		  map.put(1, "Red");
		  map.put(2, "Green");
		  map.put(3, "Black");
		  map.put(4, "White");
		  map.put(5, "Blue");
	
		  String value="White";
		myCode(map,value);
	}
	//EndOfMainMethod

	public static void myCode(HashMap<Integer,String> map,String value) 
	{
		//write code here
		System.out.println(map.containsValue(value));
		
	}
}

