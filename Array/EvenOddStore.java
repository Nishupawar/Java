public class EvenOddStore {
    public static void main(String[] args) {
        int[] a=
		{
			1,2,3,4,5,6,7,8
		}
		;
		int[] b=new int[a.length];
        int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			b[index++]=a[i];
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2!=0)
			b[index++]=a[j];
		}
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]+" ");
		}
    }
}
