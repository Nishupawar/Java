public class MiddleOfThree {
    //StartOfMainMethod
		public static void main(String[] args) {
			int A = 978, B = 518, C = 300;
	       
			myCode(A,B,C);
			  
		}

		//EndOfMainMethod
		public static void myCode(int a, int b, int c) {
			// Checking for b
			  if ((a < b && b < c) || (c < b && b < a))
		           System.out.println(b);
		 
		        // Checking for a
		        else if ((b < a && a < c) || (c < a && a < b))
		      System.out.println(a);
		 
		        else
		        System.out.println(c);
	    }
		
}
