public class SumOfCoeffOfEvenFact {
    public static void main(String[] args) {
		int n=6;
		int sum=0;
		for(int r=0;r<=n;r=r+2)
        //for(int r=0;r<=n;r++)
		{
			int nfact=calFact(n);
			int nrfact= calFact(n-r);
			int rfact= calFact(r);
			int coeff= nfact/(nrfact*rfact);
			//System.out.println(coeff);
			sum=sum+coeff;
		}
		System.out.println(sum);
	}
public static int calFact(int n) {
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
		
	}
	return fact;
}
}
