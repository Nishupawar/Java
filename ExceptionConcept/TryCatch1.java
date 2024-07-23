package ExceptionConcept;

public class TryCatch1 {
    public static void main(String[] args) {
        int a=10,b=2,c;
       System.out.println(12);
        try
        {
            System.out.println(1);
            System.out.println(2);
            c=a/b;
            System.out.println(c);
        System.out.println(11);
        }
        catch(Exception e)
        {
            System.out.println("a");
            System.out.println("c");
        }
        System.out.println(45);
    }
}
