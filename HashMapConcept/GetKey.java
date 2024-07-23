package HashMapConcept;

import java.util.HashMap;

public class GetKey {
    public static void main(String[] args) {
	HashMap<Integer,String> map= new HashMap<>();
	map.put(1, "One");
	map.put(2, "two");
	
	System.out.println(map.get(2));
	
}
}
