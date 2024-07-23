package HefShineMap;
import java.util.Iterator;
import java.util.HashSet;

public class IterateEleUsingIterator {
    public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		myCode(set);
	}
	//EndOfMainMethod
	public static void myCode(HashSet<String> set) 
	{
		//write code here
		Iterator<String> it =set.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
	}
}
