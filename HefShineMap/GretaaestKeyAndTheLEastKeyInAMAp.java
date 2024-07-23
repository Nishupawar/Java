package HefShineMap;

import java.util.TreeMap;

public class GretaaestKeyAndTheLEastKeyInAMAp {
    //private static Set<Entry<Integer, String>> entrySet;
			//StartOfMainMethod
			public static void main(String[] args) 
			{
				TreeMap<Integer,String> map = new TreeMap <Integer,String> ();
				map.put(19, "Red");
				map.put(2, "Green");
				map.put(13, "tyu");
				map.put(4, "White");
				map.put(57, "sks");
				myCode(map);
			}
			//EndOfMainMethod
			public static void myCode(TreeMap<Integer,String> map) 
			{
				//write code here
				System.out.println(map.firstEntry());
				System.out.println(map.lastEntry());
			}
}

