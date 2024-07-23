public class Index3 {
    
    public static void main(String[] args) {
        String s1="hefshinehefshinehefshinehefshinehefshine";
        String s2="shine";
    
        
        boolean isEleFound=false;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(0))
            {
                int s1Index=i;
                int s2Index=0;
                int cnt=0;
                for(int j=0;j<s2.length();j++)
                {
                    if(s1.charAt(s1Index)==s2.charAt(s2Index))
                    {
                        cnt++;
                    s1Index++;
                    s2Index++;
                    }
                }
                if(cnt==s2.length())
                {
                    isEleFound=true;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    }
    

