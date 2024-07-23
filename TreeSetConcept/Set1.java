package TreeSetConcept;

import java.util.TreeMap;
import java.util.Map.Entry;
public class Set1 {
    public static void main(String[] args) {
	TreeMap<Integer,String> map= new TreeMap<>();
	map.put(1, "One");
	map.put(2, "two");
	
	map.firstKey();
	
	//map.clear();
	Entry<Integer,String> ceilingEntry =map.ceilingEntry(4);
	System.out.println(ceilingEntry);
	map.ceilingKey(1);
	System.out.println(map.containsValue("two"));
	
	
}
}
