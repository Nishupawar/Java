public class Npr {
    public static void main(String[] args) {
       int n=3;
       int  r=3;
        System.out.println(npr(n,r));
    }
      public static int npr(int n,int r)
      {
        return fact(n)/fact(n-r);
      }

      public static int fact(int n)
      {
        if(n<=1)
        return 1;
        return n*fact(n-1);
      }
}
