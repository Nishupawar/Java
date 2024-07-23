public class MAxMoney {
    public static void main(String[] args) 
	{
		int	N = 5 , K = 10;
		myCode(N,K);
	}
	//EndOfMainMethod
	public static void myCode(int n,int k) 
	{
		int sum=0;
		for(int i=1;i<=n;i=i+2)
		{
			sum=sum+k;
		}
		System.out.print(sum);
	}
}
