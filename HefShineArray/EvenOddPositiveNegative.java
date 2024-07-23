package HefShineArray;

public class EvenOddPositiveNegative {
    public static void main(String[] args) 
	{
		int[] a=
		{
			11,22,33,44,55,66,-77,88
		}
		;
		element(a);
	}
	//EndOfMainMethod
	private static void element(int[] a) 
	{
		//code here
		int evenCnt=0;
		int oddCnt=0;
		int positiveCnt=0;
		int negativeCnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			evenCnt++;
			else
			oddCnt++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			positiveCnt++;
			else
			negativeCnt++;
		}
		System.out.println("Even Count "+evenCnt);
		System.out.println("Odd Count "+oddCnt);
		System.out.println("Positive Count "+positiveCnt);
		System.out.println("Negative Count "+negativeCnt);
	}
}
