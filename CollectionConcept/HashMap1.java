package CollectionConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
	
		HashMap<Integer,String> map= new HashMap<>();
		map.put(1,"abc");
		map.put(2, "somu");
		map.put(3, "gomu");
		map.put(4, "xyz");
		
		Set<Integer> keySet=map.keySet();
		System.out.println(keySet);
		
		Collection<String> values= map.values();
		System.out.println(values);
		
		System.out.println(map);
}
}
