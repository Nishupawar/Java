public class Abundant {
    public static void main(String[] args) {
        int n=21;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                //System.out.println(i);
            sum=sum+i;
        }
        System.out.println("sum : "+sum);
        if(sum>n)
            System.out.println("Abundant");
        else
            System.out.println("not");
    }   
}
