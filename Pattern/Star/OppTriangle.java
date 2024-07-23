public class OppTriangle {
    public static void main(String[] args) {
        int mid =0;
        int end=9;
        for(int i=1;i<=5;i++)
        {
         for(int j=1;j<=end;j++)
         {
            if(j>mid)
            System.out.print("*");
            else
            System.out.print(" ");
         }
         end--;
         mid++;
         System.out.println();
        }
    }
}

// *********
//  *******
//   *****
//    ***
//     *