public class ToLowerUpper {
    public static void main(String[] args) {
        String s="niShU";
        String s1= s.toLowerCase();
        System.out.println(s1);
        
        
        //second method
        String s2="hefShiNe";
        System.out.println("Original :"+s2);
        String ans= s2.toLowerCase();
        System.out.println("Lower Case : "+ans);
        
        String s3="";
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)>='A' && s2.charAt(i)<='Z')
            {
                char ch = (char)(s2.charAt(i)+32);
                s3=s3+ch;
            }
            else
            {
                s3= s3+s2.charAt(i);
            }
        }
        System.out.println("Lower case : " +s3);
        
        
    }
}
