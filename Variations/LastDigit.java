public class LastDigit {
    public static void main(String[] args) 
	{
		int n=2634;int m=2632;
		myCode(m,n);
	}
	//EndOfMainMethod
	private static void myCode(int m,int n)
	{
		System.out.print(compute(m,n));
	}
	static int compute(int  m,int n)
	{
		int v=1;
		if(m==n)
		return 1;
		else if((n-m ) >=5)
		return 0;
		else
		{
			for(int i=m+1;i<=n;i++)
			{
				v= v*(i%10)%10;
			}
			return v %10;
		}
	}
}
