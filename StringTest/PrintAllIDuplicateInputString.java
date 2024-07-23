public class PrintAllIDuplicateInputString {
    public static void main(String[] args) {
        String s1 = "pabcdabcdpaaaaaaa";
           String s="";
           int unicnt=0;
           for (int i = 0; i < s1.length(); i++)
            {
               int cnt=0;
               for (int j = i+1; j < s1.length(); j++) {
                   if(s1.charAt(i)==s1.charAt(j))
                   {
                       cnt++;
                       break;
                   }
               }
               if(cnt>0)
               {
                   unicnt++;
                   s=s+s1.charAt(i);
               }
           }
           System.out.println(unicnt);
           System.out.println(s);
       }
}
