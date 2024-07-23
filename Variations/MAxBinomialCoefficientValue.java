public class MAxBinomialCoefficientValue {
    public static void main(String[] args) {
        int n=5;
        int nFact=calFact(n);
        int max= 0;

        for(int r=0;r<=n;r++)
        {
            int nrFact = calFact(n-r);
            int rFact= calFact(r);
            int ans= nFact/(nrFact*rFact);
            if(ans>max)max=ans;
        }
        System.out.println(max);
    }


    public static int calFact(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
            
        }
        return fact;
    }
}
