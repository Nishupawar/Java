public class CountNumber {
    
    public static void main(String[] args) 
	{
		int n=20;
			//string74
		int cnt=0;
		for(int i=1;i<=n;i++)
		{
			if(i==4)
				cnt++;
			else
			{
				int temp=i;
				while(temp>0)
				{
					int rem= temp%10;
					if(rem==4)
					{
						cnt++;
					}
						temp=temp/10;
				}
			}
		}
		System.out.print("Count of numbers from 1 to  that have 4 as a a digit is "+cnt);	}	

}
