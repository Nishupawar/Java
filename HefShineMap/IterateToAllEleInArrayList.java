package HefShineMap;

import java.util.ArrayList;
import java.util.List;

public class IterateToAllEleInArrayList {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		List<String> List1 = new ArrayList<String>();
		List1.add("x");
		List1.add("y");
		List1.add("u");
		List1.add("a");
		myCode(List1);
	}
	//EndOfMainMethod
	public static void myCode(List<String> list1) 
	{
		//write code here
		for (String element : list1) 
		{
			System.out.println(element);
		}
	}
}
