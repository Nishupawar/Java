public class SecondMinFrequency {
    public static void main(String[] args) {
		String s1="aaabbcccc";
		char ch=0;
		int min= Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					cnt++;
			}
			if(cnt==0)
			{
				int uniCnt=0;
				for(int j=0;j<s1.length();j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
						uniCnt++;
				}
				
				
					if(uniCnt<min)
					{
						secondMin=min;
						min=uniCnt;
					}
					if(uniCnt !=min && uniCnt<secondMin)
					{
						secondMin=uniCnt;
						ch=s1.charAt(i);
					}
				}
			}
			if(secondMin==Integer.MIN_VALUE)
			{
				secondMin = -1;
				ch=' ';
			}
				
		System.out.println(ch+ " "+secondMin);
		}
}
