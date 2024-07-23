package HefShineArray;

public class LeaderEle {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			1,15,13,4,5
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				cnt++;
			}
			if(cnt==0)
			System.out.println(a[i]);
		}
	}
}
