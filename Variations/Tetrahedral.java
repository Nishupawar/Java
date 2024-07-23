public class Tetrahedral {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum= (n*(n+1)*(n+2))/6;
        }
        System.out.println(sum);
    
    }
}
