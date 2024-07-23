public class FirstandLastDigitOfNumber {
    public static void main(String[] args) 
	{
		int n = 98562;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
        System.out.println("First digit: "+first(n));
		System.out.println("last digit : "+last(n));
	}
	static int first(int n)
	{
		while(n>=10)
		{
			n=n/10;
		}
		return n;
	}
	static int last(int n)
	{
		while(n>=10)
		{
			n=n%10;
		}
		return n;
	}
}
