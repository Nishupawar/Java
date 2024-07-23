package HashMapConcept;

import java.util.HashMap;

public class Size {
    public static void main(String[] args) {
	HashMap<Integer,String> map= new HashMap<>();
	map.put(1, "One");
	map.put(2, "two");
	
	System.out.println(map);
	//map.clear();
	
	if(map.size()==0)
		System.out.println(true);
	else
		System.out.println(false);
	
	//second method
	System.out.println(map.isEmpty());
}
}
