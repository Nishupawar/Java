public class EndsWith {
    public static void main(String[] args) {
        String s1 = "nishiganddhpawar2001@gmail.com";
        String s2 = "@gmail.com";
        boolean ans = s1.endsWith(s2);
        System.out.println(ans);

        // other solution
        if(s2.length()<=s1.length())
        {
            int cnt=0;
            int s1Index = s1.length()-1;
            int s2Index = s2.length()-1;
            while(s2Index >-0)
            {
                if(s1.charAt(s1Index )==s2.charAt(s2Index))
                cnt++;
                s1Index--;
                s2Index--;
            }
            if(cnt==s2.length())
            System.out.println(true);
            else
            System.out.println(false);
    }
        else
        System.out.println("Not same");
        
    }
}
