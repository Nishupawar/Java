public class ReversePalindrome {
    public static void main(String[] args) {
        String s1="abcba";
        int start=0;
        int end=s1.length()-1;
        
        while(start<=end)
        {
            if(s1.charAt(start)!=s1.charAt(end))
            {
                System.out.println(false);
                break;
            }
        start++;
        end--;
        }
        if(start>=end)
            System.out.println(true);
    }
}
