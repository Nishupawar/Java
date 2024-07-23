  //package PatternPdf;

public class Pattern8 {
    public static void main(String[] args) {
        int mid = 5;
        for (int i = 1; i <= 9; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
               // System.out.print("*");
            if(j>=mid)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            if(i<5)
            mid--;
            else
            mid++;
            System.out.println();
        }
    
    }
}


//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *