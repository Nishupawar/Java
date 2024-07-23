public class Replace {
    public static void main(String[] args) {
        String s1="dfdfdfdf";
        String ans= s1.replace("d", "f");
        System.out.println(ans);
        
        
        //second Method
        String s11="ndndndnd";
        String ans1= s11.replace("d", "n");
        System.out.println(ans1);
        
        
        String s2="";
        for(int i=0;i<s11.length();i++)
        {
            if(s11.charAt(i)=='d')
            {
                s2= s2+'n';
                
            }
            else
                s2= s2+s11.charAt(i);
        }
        System.out.println(s2);
        
    }
}
