public class FindXY {
    public static void main(String[] args) 
	{
		int a = 2, b = 3, n = 7;
		myCode(a,b,n);
	}
	//EndOfMainMethod
	private static void myCode(int a,int b,int n)
	{
		solution(a, b, n);
	}
	static void solution(int a, int b, int n)
	{
		for (int i = 0; i * a <= n; i++)
		{
			if ((n - (i * a)) % b == 0)
			{
				System.out.println("x = " + i + 
				", y = " + 
				(n - (i * a)) / b);
				return ;
			}
		}
		System.out.println("No solution");
	}

}
