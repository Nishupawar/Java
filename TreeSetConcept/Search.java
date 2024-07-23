package TreeSetConcept;

import java.util.TreeMap;

public class Search {
    public static void main(String[] args) {
		TreeMap<Integer,String> map= new TreeMap<>();
		map.put(1, "One");
		map.put(2, "two");
		System.out.println(map);
		System.out.println(map.containsKey(3));
}
}
