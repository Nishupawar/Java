package ExceptionConcept;
import java.lang.ArithmeticException;
public class TwoException {
    public static void main(String[] args) {
        int [] a= {2,3,45,67};
        
        try {
        System.out.println("Hello");
        System.out.println("Hii");
        System.out.println(a[6]);
        System.out.println(a[2]/0);
        System.out.println(a[7]);
        }
    catch( ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            System.out.println(e.getMessage());
            
        }
    	// catch(ArithmeticException e)
    	// {
    	// 	System.out.println(e.getMessage());
    	// }
        // catch(ArrayIndexOutOfBoundsException e)
    	// {
    	// 	System.out.println(e.getMessage());
    	// }
        System.out.println("Bye");
    }
}
