public class MIsThePowerOfN {
    public static void main(String[] args) 
	{
		int m = 23, n = 82;
		myCode(m,n);
	}
	//EndOfMainMethod
	private static void myCode(int m,int n)
	{
		System.out.println(power(m,n)?"True":"False");
	}
	static boolean power(int m,int n)
	{
		int pow=1;
		if(m==1)
		return(n==1);
		while(pow<n)
		{
			pow=pow*m;
		}
		return (pow==n);
	}
}
