package HefShineArray;

public class RemoveDuplicateUniqueCount {
    public static void main(String[] args) 
	{
		int[] a = {2,1,5,4,3,2,1,6,4,2};
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 	
	{
		//WriteCode Here
		int newCnt=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
			newCnt++;
		}
		System.out.print("new length of array : "+newCnt);
	}
}
