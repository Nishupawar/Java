package TreeSetConcept;

import java.util.TreeMap;

public class Copy {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
	map.put(1, "One");
	map.put(2, "two");
	
	TreeMap<Integer,String> map2= new TreeMap<>();
	map2.putAll(map);
	System.out.println(map2);

    }
}
