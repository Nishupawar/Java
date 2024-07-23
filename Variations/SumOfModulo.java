public class SumOfModulo {
    public static void main(String[] args) {
        int sum=0;
        int n=10;
        int k=2;
        for (int i = 1; i <=n; i++) {
            int modulo= i% k;
            sum=sum+modulo;
            System.out.print(modulo+" ");
        }
        
        System.out.println("sum :"+sum);
    }
}
