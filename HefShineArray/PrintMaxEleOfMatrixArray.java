package HefShineArray;

public class PrintMaxEleOfMatrixArray {
    public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,2,3
			}
			,
			{
				4,23,5
			}
			,
			{
				5,4,7
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		//WriteCode Here
		int max= Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]>max)
				max=a[i][j];
			}
			
		}
System.out.println(max);
	}
}
