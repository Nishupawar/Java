public class RepetativeAdditionOfDigit {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		long n =98;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(long n) 	
	{
		//long temp=n;
		long sum=0;
		while(n>0)
		{
			long rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
	//	System.out.println(sum);
		long sum1=0;
		while(sum>0)
		{
			long rem = sum%10;
			sum1= sum1+rem;
			sum=sum/10;
		}
		System.out.println(sum1);
	}
}
