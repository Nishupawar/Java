public class Duplicate {
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
           
            if(cnt>0)//only duplicate
            {
            s2=s2+s.charAt(i);
            uniCnt++;
            }
        }
        System.out.println("unique Count : "+uniCnt);
        System.out.print("Duplicate : "+s2);
    }
}
