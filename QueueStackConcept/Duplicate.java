package QueueStackConcept;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Duplicate {
   public static void main(String[] args) {
	int[] a= {1,2,2,3,3,3,4,4,4,4,6,6,6,6,6};
	ArrayList<Integer> al = new ArrayList<>();
	LinkedHashMap<Integer, Integer> map= new LinkedHashMap<>();
	
	for(int data: a)
	{
		if(map.containsKey(data))
		{
			int val=map.get(data);
			val++;
			if(val>2)
				al.add(data);
			map.put(data, val);
		}
		else
		{
			map.put(data, 1);
		}
	}
	System.out.println(al);
} 
}
