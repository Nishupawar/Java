package HefShineArray;

public class RemoveDuplicate {
        
    public static void main(String[] args) 
	{
		int[] a= 
		{
			1,3,5,6,2,3,4,5,97,1,23,
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
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
			System.out.print(a[i]+" ");
		}
	}
}
