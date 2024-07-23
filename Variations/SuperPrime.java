public class SuperPrime {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 241;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		System.out.println("Super-Primes less than or equal to " + n + " are :");
		superPrimes(n);
	}
	static void SieveOfEratosthenes(int n, boolean isPrime[])
	{
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i <= n; i++)
		isPrime[i] = true;
		for (int p = 2; p * p <= n; p++) 
		{
			if (isPrime[p] == true) 
			{
				// Update all multiples of p
				for (int i = p * 2; i <= n; i += p)
				isPrime[i] = false;
			}
		}
	}
	static void superPrimes(int n)
	{
		boolean isPrime[] = new boolean[n + 1];
		SieveOfEratosthenes(n, isPrime);
		int primes[] = new int[n + 1];
		int j = 0;
		for (int p = 2; p <= n; p++)
		if (isPrime[p])
		primes[j++] = p;
		for (int k = 0; k < j; k++)
		if (isPrime[k + 1])
		System.out.print(primes[k] + " ");
	}
}
