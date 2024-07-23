public class SumOFFactOFN {
    public static void main(String[] args) {
        int n=6;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
              //  System.out.print(j+" ");
                    sum=sum+j;
                    
            }
           // System.out.println();
        }
        System.out.println(sum);
    }
}
