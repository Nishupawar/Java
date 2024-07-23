
public class Test1 {
 public static void main(String[]args) {
	 int a=56;
	 int b=56;
	 int c=56;
	 
	 if(a==b && b==c && a==c)
		 System.out.println("Equilateral");//all equal
	 
	 else if(a==b || b==c || a==c)
		 System.out.println("Isoscele");// two side equal
	 
	 else
		 System.out.println("Scelene");// all different
 }
}
