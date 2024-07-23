public class Unique {
    public static void main(String[] args) {
        String 	 s="heffshinne";
        String s2="";
        int uniCnt=0;
        for(int i=0;i<s.length();i++)
        {
            int cnt=0;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j)) {
                    cnt++;
                }
            }
            if(cnt==0) //unique       
             {
            s2=s2+s.charAt(i);
            uniCnt++;
            }
        }
        System.out.println("Unique Count : "+uniCnt);
        System.out.print("Unique : "+s2);
    }
}
