public class SquarePyramidNumber {
    public static void main(String[] args) { 
        int input=55;
        for(int i=1;i<=10;i++)
        {
          int sum=0;
            for(int j=1;j<=i;j++)
            {
                sum= sum+(j*j);      
            }
          //  System.out.println("Sum of : "+sum);
          if(sum==input)
          {
          System.out.println("square pyramidal num");
          break;
          }
          if(sum>input)
          {
          System.out.println("-1");
          break;
          }
        }
    }
}
