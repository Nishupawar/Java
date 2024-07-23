public class NumberOfDivisor {
    public static void main(String[] args) {
        int num=6;
        int cnt=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            if(i%3==0)
            cnt++;
        }
        System.out.println("Count " +cnt);
    
    }
}
