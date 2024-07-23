public class DigitCount {
    public static void main(String[] args) {
        int n=45;
        System.out.println(count(n));
    }
    public static int count(int n)
    {
        int temp=n,cnt=0;
        while(temp!=0)
        {
            int d= temp%10;
            temp=temp/10;

            if(d >0 && n %d==0)
            cnt++;
        }
        return cnt;
    }
}
