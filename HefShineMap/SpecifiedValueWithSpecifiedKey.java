package HefShineMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class SpecifiedValueWithSpecifiedKey {
    public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap <Integer,String> ();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "xyz");
		map.put(4, "White");
		map.put(5, "abc");

        Set<Entry<Integer, String>> keySet = map.entrySet();
		
		for(Entry<Integer, String> key:keySet)
		{
		System.out.println(key);
		}
    }
}
