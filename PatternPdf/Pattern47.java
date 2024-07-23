public class Pattern47 {
    
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int irange=9;
		int jrange=9;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	public static void myCode(int irange,int jrange)
	{
		//Write code here
		for(int i=1;i<=irange;i++)
		{
			int cnt=9;
			for(int j=1;j<=i;j++)
			{
				System.out.print(cnt);
				cnt--;
			}
			System.out.println();
		}
	}

}
