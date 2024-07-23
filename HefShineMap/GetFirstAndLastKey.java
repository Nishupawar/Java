package HefShineMap;

import java.util.HashMap;
import java.util.TreeMap;

public class GetFirstAndLastKey {
    public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(22, "twotwo");
		hm.put(43, "fourtyThree");
		hm.put(1, "one");
		hm.put(9, "nine");
		hm.put(5, "five");
		myCode(hm);
	}
	//EndOfMainMethod
	private static void myCode(HashMap<Integer, String> hm) 
	{
		//write code here
		TreeMap<Integer, String> hm2=new TreeMap<>(hm);
		System.out.println(hm2.firstKey()+" "+hm2.lastKey());

	}
}
