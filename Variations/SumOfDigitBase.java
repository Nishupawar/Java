public class SumOfDigitBase {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 8;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		print(n);
	}
	static int solve(int n,int base)
	{
		int re=0;
		while(n>0)
		{
			int r=n%base;
			re=re+r;
			n=n/base;
		}
		return re;
	}
	static void print(int n)
	{
		for(int base=2;base<n;++base)
		{
			System.out.print(solve(n,base)+" ");
		}
	}
}
