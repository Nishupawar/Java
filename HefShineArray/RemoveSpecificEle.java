package HefShineArray;

public class RemoveSpecificEle {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			33,7,90,20,5,50,40
		}
		;
		int ele=78;
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
			cnt++;
		}
		int[] b= new int[a.length-cnt];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			b[index++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
