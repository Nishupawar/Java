package HefShineArray;

public class ArrayContainSpecificValue {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			33,7,90,20,5,50,40
		}
		;
		int ele=7;
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
				System.out.println("found");
				cnt++;
				break;
			}
		}
		if(cnt==0)
		System.out.println("not found");
	}
}
