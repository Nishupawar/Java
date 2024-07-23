public class frequency {
    public static void main(String[] args) {
        String s1="abcdabcaba";
        
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
                int freq=0;
                for(int j=0;j<s1.length();j++)
                {
                    if(s1.charAt(j)==s1.charAt(i))
                        freq++;
                }
                System.out.println(s1.charAt(i)+" "+freq);
            }
            
        }
    }
}
