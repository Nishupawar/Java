public class PrimeFactOfANo {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int number= 15;
		myCode(number);
	}
	//EndOfMainMethod
	public static void myCode(int n) 
	{
		prime(n);
	}
	public static void prime(int n)
	{
		while(n%2==0)
		{
			System.out.println(2+" ");
			n=n/2;
		}
		for(int i=3;i<=Math.sqrt(n);i=i+2)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
		if(n>2)
		System.out.print(n);
	}

}
