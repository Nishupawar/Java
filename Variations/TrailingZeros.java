public class TrailingZeros {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		// M must be be a Prime Number
		int n = 100;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		System.out.println("Count of trailing 0s in " + n
		+ "! is "
		+ findTrailingZeros(n));
	}
	static int findTrailingZeros(int n)
	{
		if (n < 0) 
		return -1;
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5)
		count += n / i;
		return count;
	}
}
