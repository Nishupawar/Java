public class PermutationCalculation {
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int nFact=calFact(n);
        int nrFact=calFact(n-r);
        int ans= nFact/nrFact;
        System.out.println("permutations : "+ans);
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
