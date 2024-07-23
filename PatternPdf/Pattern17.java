//package PatternPdf;

public class Pattern17 {
    public static void main(String[] args) {
        int mid=1;
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=5;j++) {
                if(j<mid)
                System.out.print(" ");
                else
                System.out.print("* ");
            }
            if(i<5) {
                mid++;
            }
            else
            {
                mid--;
            }
            System.out.println();
        }
    }
}


// * * * * * 
//  * * * *
//   * * *
//    * * 
//     *
//    * *
//   * * * 
//  * * * * 
// * * * * *