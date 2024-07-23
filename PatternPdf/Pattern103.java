public class Pattern103 {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
            int end=5;
            for(int j=1;j<=end;j++)
            {
              if(i==j || i==1 || i==5 ||(i+j==end+1))
              System.out.print("*");
              else
              System.out.print(" ");
            }
            end--;
            System.out.println();
        }
    }
}
/* 

*****
 * *
  *
 * *
*****

*/