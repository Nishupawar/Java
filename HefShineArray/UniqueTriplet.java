package HefShineArray;

public class UniqueTriplet {
    public static void main(String[] args) 
		{
			int[] a= 
			{
				5,1,3,4,7
			}
			;
			int num=12;
			myCode(a,num);
		}
		//EndOfMainMethod
		private static void myCode(int[] a,int num) 
		{
			//WriteCode Here
			int uniqueCnt = 0;
			for (int i = 0; i < a.length; i++) 
			{
				int cnt = 0;
				for (int j = 0; j < i; j++) 
				{
					if (a[i] == a[j])
					cnt++;
				}
				if (cnt == 0)
				uniqueCnt++;
			}
			int[] b = new int[uniqueCnt];
			int index = 0;
			for (int i = 0; i < a.length; i++)
			{
				int cnt1 = 0;
				for (int j = 0; j < i; j++) 
				{
					if (a[i] == a[j])
					cnt1++;
				}
				if (cnt1 == 0) 
				{
					b[index++] = a[i];
				}
			}
			for (int i = 0; i < b.length; i++)
			{
				for (int j = i+1; j < b.length; j++)
				{
					for(int k=j+1;k<b.length;k++)
					{
						if(b[i]+b[j]+b[k]<12)
						System.out.println(b[i] + " " + b[j]+" "+b[k]);
					}
				}
			}
		}
}
