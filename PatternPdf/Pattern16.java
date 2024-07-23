//package PatternPdf;

public class Pattern16 {
    public static void main(String[] args) {
        int mid=1;  int end=9;
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=end;j++)  {
                if(j<mid)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            if(i<5)  {
                mid++;  
                 end--;
            }
            else {
                mid--;  
                 end++;
            }
            System.out.println();
        }
    }
}


// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********