public class HalfAndHalf {
    public static void main(String[] args) 
	{
		int N = 100, M = 4;
		myCode(N,M);
	}
	//EndOfMainMethod
	public static void myCode(int n,int m) 
	{
		int cnt=1;
		while(cnt<m)
		{
			n=n/2;
			cnt++;
		}
		System.out.println(n);
	}
}
