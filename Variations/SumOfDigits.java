public class SumOfDigits {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 8;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		printSumsOfDigits(n);
	}
	static int solve(int n, int base)
	{
		int result = 0 ;
		while (n > 0)
		{
			int remainder = n % base ;
			result = result + remainder ; 
			n = n / base;
		}
		return result ;
	}
	static void printSumsOfDigits(int n)
	{
		for (int base = 2 ; base < n ; ++base) 
		System.out.print(solve(n, base)+" "); 
	}
}
