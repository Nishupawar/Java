package HefShineArray;

public class SumAndAvgOfAnArrayEle {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5,6,7,8
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		double sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum= sum+a[i];
		}
		avg= sum/a.length;
		System.out.println(sum);
		System.out.println(avg);
	}
}
