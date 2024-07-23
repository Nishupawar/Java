public class EleBeforeBigger {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			10, 40, 23, 35, 50, 7
		}
		;
		int n=a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		int k=0;
		for(int i=n-1;i>=0;i--)
		{
			int cnt=0;
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]<a[j])
				cnt++;
			}
			if(cnt==0)
			k++;
		}
		System.out.print(k);
	}
}
