package ExceptionConcept;
//import java
public class ThrowsException1 {
    static void m1() throws Exception
	    {
	        m2();
	         System.out.println("m2..");
	    }
	     static void m2()  throws Exception
	    {
	        m3();
	         System.out.println("m2..");
	    }
	     static void m3() throws Exception
	    {
	        m4();
	        System.out.println("m3..");
	    }

	     static void m4() throws Exception
	    {
	        System.out.println(34/0);
	        System.out.println("m4...");
	    }
	    public static void main(String[] args) {
	        try
	         {
	            m1();
	            
	        } catch (Exception e)
	         {
	           System.out.println("Exception Handled");
	        }
	    }
    }