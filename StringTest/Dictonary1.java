public class Dictonary1 {
    public static void main(String[] args) {
        String s1="hef";
        String s2="hefshine";
        System.out.println(s1.compareTo(s2));
        
        int cnt=0;
        
        for(int i=0;i<s1.length()&& i<s2.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                cnt++;
                System.out.println(s1.charAt(i)-s2.charAt(i));
                break;
            }
        }
        if(cnt==0)
            System.out.println(s1.length()-s2.length());
    }
}
