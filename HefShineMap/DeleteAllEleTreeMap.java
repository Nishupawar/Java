package HefShineMap;

import java.util.TreeMap;

public class DeleteAllEleTreeMap {
   public static void main(String[] args) 
	{

		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(21, "twoOne");
		tm.put(4, "four");
		tm.put(15, "fifteen");
		tm.put(3, "three");
		tm.put(7, "seven");
	
	
		System.out.println(tm);
		tm.clear();
		System.out.println(tm);
	} 
}
