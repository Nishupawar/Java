//package PatternPdf;

public class Pattern7 {
    public static void main(String[] args) {
        int mid=0;
        for(int i=1;i<=5;i++)  {
            for(int j=1;j<=5;j++)
            {
                if(j<=mid)
                {
                System.out.print(" ");
                }
                else
                {
                System.out.print("*");
                }
            }
            System.out.println();
            mid++;
        }
        
    }
}


// *****
//  ****
//   ***
//    **
//     *