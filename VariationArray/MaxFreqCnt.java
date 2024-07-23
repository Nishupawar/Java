public class MaxFreqCnt {
    public static void main(String[] args) 
	{
		int[] a = 
		{
			2, 3, 4, 7, 1, 2, 3, 5, 3
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//write code here
		int maxCnt=0;
		int maxFreq=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
					cnt++;
			}
		
		if(cnt>maxCnt)
		{
			maxCnt=cnt;
			maxFreq=a[i];
		}
		}	
	System.out.println(maxCnt+" "+maxFreq);
		
		
		
		
		
		
		
		
		
		
		
//		int cnt1=0;
//		int k=0;
//		for(int i=0;i<a.length;i++)
//		{
//			int cnt=0;
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				cnt++;
//			}
//			if(cnt>cnt1)
//			{
//				cnt1=cnt;
//				k=a[i];
//			}
//		}
//		System.out.print(k+" ");
//		System.out.print(cnt1);
	}
}
