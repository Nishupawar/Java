//package PatternPdf;

public class MiddleHash
 {
    public static void main(String[] args) 
    {
        for(int i=1;i<=3;i++)
        {
         for(int j=1;j<=3;j++)
         {
          // if((i==2 || i==1 || i==3) && j==2)
           if(j==2)
           System.out.print("#");
           else
           System.out.print("*");
         }
         System.out.println();
        }
    }    
}


// *o**
// *o**
// *o**