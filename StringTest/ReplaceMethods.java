public class ReplaceMethods
 {
    public static void main(String[] args) 
	{
		//(.) or (.*) regular regex
		//replace
		String s= "abababaa";
		System.out.println(s.replace('a', 'u')); //ubububuu
		
		String s1= "This is demo";
		System.out.println(s1.replace("is","was")); //Thwas was demo
		System.out.println(s1.replaceFirst("is", "was")); //Thwas is demo
		System.out.println(s1.replaceAll("is", "was")); //Thwas was demo
		System.out.println(s1.replaceAll("is(.)","was")); //Thwaswasdemo
		System.out.println(s1.replaceAll("is(.*)", "was")); //Thwas
		System.out.println(String.join(":", s1," Of Java Prg"));//This is demo: Of Java Prg

		
		
	}
    
}
