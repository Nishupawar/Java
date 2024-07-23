
public class NumberUtils {
   
        public static boolean isPrime(int num)
        {
          
            int cnt=0;
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                cnt++;
            }
        
        if(cnt==0)
        return true;
        else
        return false;
    }

    public static int factorial(int num1)
    {
       int fact=1;
       for(int i=num1;i>=1;i--)
       {
        fact=fact*i;
       }
       System.out.println(fact);
       return 0;
    }
}