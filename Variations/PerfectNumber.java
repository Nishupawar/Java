public class PerfectNumber {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		//obj.24
		int num=15;
		myCode(num);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		System.out.println(isPerfectNumber(n));
	}
	public static boolean isPerfectNumber(int n) 
	{
		if (n <= 1) 
		{
			return false; 
		}
		int sum = 1; // 1 is always a divisor.
		for (int i = 2; i * i <= n; i++) 
		{
			if (n % i == 0) 
			{
				sum += i;
				if (i != n / i) 
				{
					sum += n / i;
				}
			}
		}
		return sum == n;
	}
}
