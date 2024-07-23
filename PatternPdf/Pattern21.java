public class Pattern21 {
    public static void main(String[] args) {
        int end = 9;
        int mid = 5;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=end; j++)
             {
                if(j<mid)
                System.out.print(" ");
            else
                System.out.print("*");
            }
            mid--;
            end--;
            System.out.println();

        }
    }
}

//     *****
//    *****
//   *****
//  *****
// *****