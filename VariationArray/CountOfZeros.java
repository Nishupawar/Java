package VariationArray;

public class CountOfZeros {
    public static void main(String[] args) 
	{
		int N = 3;
		int A[][] = 
		{
			{
				0, 0, 0
			}
			,
			{
				0, 0, 1
			}
			,
			{
				0, 1, 1
			}
		}
		;
		myCode(A,N);
	}
	//EndOfMainMethod
	public static void myCode(int A[][], int N) 
	{
		int cnt=0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(A[i][j]==0)
				cnt++;
			}
		}
System.out.print(cnt);
	}
}
