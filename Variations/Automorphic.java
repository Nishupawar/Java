public class Automorphic {
    public static void main(String[] args) {
        int n=76;
        int sq= (int)Math.pow(n,2);
        int temp=n;
        int cnt=0;
        while(temp>0)
        {
            temp=temp/10;
            cnt++;
        }
        int pow=(int) Math.pow(10,cnt);
        int fp= sq%pow;
        if(fp==n)
        System.out.println("Automorphic");
        else
        System.out.println("Not Automorphic");
    }
}
