public class LowestFrequency {
    public static void main(String[] args) {
        String s1="weLcome";
  int min = Integer.MAX_VALUE;
    char ch=0;
        for (int i = 0; i < s1.length(); i++) 
        {
            int cnt=0;
            for (int j = 0; j <i; j++) {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    cnt++;
                   // break;
                }
            }
            if(cnt==0)
            {
                int count=0;
                for (int j = 0; j < s1.length(); j++) 
                {
                      if(s1.charAt(i)==s1.charAt(j))
                      count++;
                }
                if(count<min)
                {
                    min=count;
                    ch= s1.charAt(i);
                }
                //System.out.println(s1.charAt(i)+" "+count);
            }
        }
        System.out.println(ch+" "+min);
    }
}
