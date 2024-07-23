public class PowerOfFFact {
    public static void main(String[] args) {
        int n=4;
        int pow=2;
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact= fact*i;
        }
        int cnt=0;
        while(true)
        {
            int mod = fact%pow;
            if(mod==0)
            {
                fact = fact/pow;
              cnt++;
            }
            else
            {
                break;

            }
        }
        System.out.println(cnt);
    }
}
