public class PrimeComposite {
    public static void main(String[] args) {
        int num=24;
         boolean result= ans(num);
         
         if(result)
             System.out.println("Composite");
         else
             System.out.println("Prime");
    }
    
    private static boolean ans(int num) {
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                return true;
        }
        return false;
    }
}
