import java.util.Arrays;

public class Dictonary {
    public static void main(String[] args) {
	String[] a= {"a","welcome","abc","hefshine"};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i].compareTo(a[j])>0)
			{
			String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
