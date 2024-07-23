public class ArrayPalindrome {
    public static void main(String[] args) {
        int[]a={111,222,333,444,555};
        
      int cnt=0;
      for (int i = 0; i < a.length; i++) {
        int ele= a[i];
        int rev=0;
        while(ele>0)
        {
            int rem =ele%10;
            rev = rev*10+rem;
            ele= ele/10;

        }
        if(rev==a[i])
        cnt++;
        else
        break;
      }

        if(cnt==a.length)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
    }
}


  