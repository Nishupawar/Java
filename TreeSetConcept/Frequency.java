package TreeSetConcept;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
	String s="abcdaabcc";
	HashMap<Character,Integer>map= new HashMap<>();
	
	for(int i=0;i<s.length();i++)
	{
		char key=s.charAt(i);
		if(map.containsKey(key)==true)
		{
			int value= map.get(key);
			value= value+1;
			map.put(key,value);
		}
		else
		{
			map.put(key, 1);
		}
	}
	System.out.println(map);
}
}
