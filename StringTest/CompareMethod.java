public class CompareMethod {
    
 public static void main(String[] args) {
	String s1= "nishigandha";
	String s2="pawar";
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
	System.out.println(String.join(";",s1,s2 )); 
	System.out.println(s1.substring(3));
	System.out.println(s1.substring(2, 8 ));
	System.out.println(s1.subSequence(2,5));
	
	
	String a= "ab";
	String b="AB";
	
	System.out.println(a.compareTo(b));
	System.out.println(a.compareTo(b)>0);
	System.out.println(a.compareToIgnoreCase(b));
	System.out.println(a.compareToIgnoreCase(b)>0);
	;
}
}