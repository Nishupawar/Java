package VariationArray;

public class FindExtraEleUsingForLoop {
    public static void main(String[] args) {
		int[] a= {1,2,3,5,6};
		int[]b= {1,2,3,4,6};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			continue;	
			else
			{
				System.out.println(i);
			break;
			}
		}
	}
}
