package ExceptionConcept;

public class First {
    public static void main(String[] args) {
        int c=0;
        
        int a=10;
        int b=0;
        try {
         c= a/b;
        }
        catch(Exception e)
        {
            System.out.println("Infinite");
        }
        System.out.println(c);
    }
}
