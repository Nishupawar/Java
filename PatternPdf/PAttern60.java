public class PAttern60 {
  public static void main(String[] args) 
	{
		int irange=9;
		int jrange=5;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	public static void myCode(int irange,int jrange)
	{
		//Write code here
		//int end=5;
		int mid=1;
		int a=1;
		for(int i=1;i<=irange;i++)
		{
			int a1=a;
			for(int j=1;j<=jrange;j++)
			{
				if(j<mid)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(a1+" ");
					a1++;
				}
			}
			if(i<5)
			{
				mid++;
				a++;
			}
			else
			{
				mid--;
				a--;
			}
			System.out.println();
		}
	}
}
// 1 2 3 4 5 
//  2 3 4 5
//   3 4 5
//    4 5
//     5
//    4 5
//   3 4 5
//  2 3 4 5
// 1 2 3 4 5