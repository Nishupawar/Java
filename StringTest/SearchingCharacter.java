public class SearchingCharacter
 {
    public static void main(String[] args)
	{
		
		String s= "nishigandha";
		System.out.println(s.indexOf('a'));//6
		System.out.println(s.lastIndexOf('n'));//7
		System.out.println(s.charAt(2));//s
		System.out.println(s.contains("n"));//true
		System.out.println(s.startsWith("ns")); //false
		System.out.println(s.endsWith("h")); //false
		
		System.out.println(s.indent(1));// for 1 space
		
	}
}
