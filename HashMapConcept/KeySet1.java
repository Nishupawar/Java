package HashMapConcept;

import java.util.HashMap;
import java.util.Set;

public class KeySet1 {
    public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<>();
		map.put(1, "One");
		map.put(2, "two");
		
		System.out.println(map.get(2));
		Set<Integer> keys= map.keySet();
		System.out.println(keys);
		
			}
}
}
