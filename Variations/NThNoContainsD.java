public class NThNoContainsD {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 47, d = 7;
		myCode(n,d);
	}
	//EndOfMainMethod
	private static void myCode(int n,int d)
	{
		print(n,d);
	}
	static boolean isD(int x,int d)
	{
		while(x>0)
		{
			if(x%10==d)
			break;
			x=x/10;
		}
		return (x>0);
	}
	static void print(int n,int d)
	{
		for(int i=0;i<=n;i++)
		if(i==d||isD(i,d))
		System.out.print(i+" ");
	}
}
