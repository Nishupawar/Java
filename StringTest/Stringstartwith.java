public class Stringstartwith {
    public static void main(String[] args) {
        String s1= "hefshine";
        String s2= "hef";
        boolean ans = s1.startsWith(s2);
        System.out.println(ans);

        //other method
      
        if(s2.length()<=s1.length())
        {
            int cnt=0;
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i)==s1.charAt(i))
            cnt++;
        }
        if(cnt==s2.length())
        
            System.out.println("equal");
        
        else
    System.out.println("not equal");
    }
        else
        System.out.println("Not same");
    }
}


