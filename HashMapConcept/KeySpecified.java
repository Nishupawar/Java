package HashMapConcept;

import java.util.HashMap;
import java.util.Set;

public class KeySpecified {
    public static void main(String[] args) {
	HashMap<Integer,String> map= new HashMap<>();
	map.put(1, "One");
	map.put(2, "two");
	
	System.out.println(map);
	
	System.out.println(map.containsKey(2));
	
	Set<Integer> keySet= map.keySet();
	int cnt=0;
	for(int key: keySet)
	{
		if(key==2)
		{
			System.out.println(true);
			cnt++;
		}
	}
	if(cnt==0)
		System.out.println(false);
}
}
