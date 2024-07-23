public class PrimeLesthan {
    public static void main(String[] args) {
        int n=10;
        for(int i=2;i<=n;i++)
        {
            boolean result = prime(i);
            if(result)
                System.out.println(i);
        }
    }
    
    private static boolean prime(int i) {
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
                return false;
        }
        return true;
    }
}
