package HashMapConcept;

import java.util.Collection;
import java.util.HashMap;

public class ValuesSet1 {
    public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<>();
		map.put(1, "One");
		map.put(2, "two");
		
		
		Collection<String> values= map.values();
		System.out.println(values);
	}
}
