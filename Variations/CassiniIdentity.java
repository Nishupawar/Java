public class CassiniIdentity {
    public static void main(String[] args) {
        int n=5;
        System.out.println(cass(n));
    }

    public static int cass(int n)
{
     return( n & 1 ) !=0 ?-1:1 ;
}
} 
