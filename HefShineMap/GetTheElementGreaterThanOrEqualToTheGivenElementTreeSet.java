package HefShineMap;

import java.util.TreeSet;

public class GetTheElementGreaterThanOrEqualToTheGivenElementTreeSet {
    public static void main(String[] args) 
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(28);
		set.add(2);
		set.add(1);
		set.add(84);
		set.add(68);
		int ele=50;
		myCode(set,ele);
	}
	//EndOfMainMethod
	public static void myCode(TreeSet<Integer> set,int ele) 
	{
		//write code here
		System.out.print(set.ceiling(ele));
	}

}
