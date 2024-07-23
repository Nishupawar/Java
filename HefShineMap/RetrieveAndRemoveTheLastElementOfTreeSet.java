package HefShineMap;

import java.util.TreeSet;

public class RetrieveAndRemoveTheLastElementOfTreeSet {
    //StartOfMainMethod
		public static void main(String[] args) 
		{
			TreeSet<Integer> set = new TreeSet<Integer>();
			set.add(28);
			set.add(42);
			set.add(11);
			set.add(4);
			set.add(8);
			myCode(set);
		}
		//EndOfMainMethod
		public static void myCode(TreeSet<Integer> set) 
		{
			//write code here
			System.out.println(set);
			System.out.println("Remove element : "+set.pollLast());
			System.out.println(set);
		}
}
