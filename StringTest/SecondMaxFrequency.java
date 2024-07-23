public class SecondMaxFrequency {
    public static void main(String[] args) {
        String s1="aaabbcccc";
        char ch=0;
        int max= Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
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
                
                
                    if(uniCnt>max)
                    {
                        secondMax=max;
                        max=uniCnt;
                    }
                    if(uniCnt !=max && uniCnt>secondMax)
                    {
                        secondMax=uniCnt;
                        ch=s1.charAt(i);
                    }
                }
            }
            if(secondMax==Integer.MIN_VALUE)
            {
                secondMax = -1;
                ch=' ';
            }
                
        System.out.println(ch+ " "+secondMax);
        }
    
}
