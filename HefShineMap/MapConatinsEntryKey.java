package HefShineMap;
import java.util.Set;
import java.util.HashMap;

public class MapConatinsEntryKey {
    public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap <Integer,String> ();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");
		myCode(map);
	}
	//EndOfMainMethod
	public static void myCode(HashMap<Integer,String> map) 
	{
		//write code here
        Set<Integer> keySet= map.keySet();
        if(keySet.size()==0)
        System.out.println(true);
        else
        System.out.println(false);

        //  Set<Integer> keySet = map.keySet();
        // if(keySet.size()==0)
        // System.out.println(true);
        // else
        // System.out.println(false);
}
}
