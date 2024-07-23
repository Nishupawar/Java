package HefShineArray;

public class FindIndexOfAnArrayEle {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			1,6,2,3,4,5,6,7
		}
		;
		int ele=6;
		myCode(a,ele);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int ele) 	
	{
		//WriteCode Here
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				System.out.println(i);
				cnt++;
			}
		}
		if(cnt==0)
		System.out.print("not found");
	}
}
