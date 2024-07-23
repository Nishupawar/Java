public class ToUpperCase {
    public static void main(String[] args) {
        String s="niShU";
        String s1= s.toUpperCase();
        System.out.println(s1);
        
        
        //second method
        String s2="hefShiNe";
        System.out.println("Original :"+s2);
        String ans= s2.toUpperCase();
        System.out.println("Upper Case : "+ans);
        
        String s3="";
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)>='a' && s2.charAt(i)<='z')
            {
                char ch = (char)(s2.charAt(i)-32);
                s3=s3+ch;
            }
            else
            {
                s3= s3+s2.charAt(i);
            }
        }
        System.out.println("Upper case : " +s3);
        
        
    }
}
