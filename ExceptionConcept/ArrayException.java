package ExceptionConcept;

public class ArrayException {
    public static void main(String[] args) {
	
        int []a= {2,3,4,5,6};
        try
        {
        System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound Exception");
        }
        System.out.println("Bye Bye");
    }
}
