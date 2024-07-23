package HashMapConcept;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap<>();
	
	map.put(1, "abc");
	map.put(2, "xyz");
	System.out.println(map);
	
	Set<Entry<Integer,String>> entrySet=map.entrySet();
	System.out.println(entrySet);
}

}
