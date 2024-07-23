public class Demo {

	public static void main(String[] args) 
	{
		//basic116
		
		int a = 10;
	    int b = 20;
	    int c = 0;
		myCode(a,b,c);
	}


	private static void myCode(int a,int b,int c) 
	{
		 

		    c = ++a + ++b * 2 + a++;

		    System.out.println(a + "," + b + "," + c);
		  }
}