public class Line {
 public static void main(String[] args) {
    int end=5;
    int start=1;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=start;j++)
    {
        System.out.print(" ");
    }
        for(int j=start;j<=end;j++)
        {
            System.out.print("*");
        }
        start++;
        end++;
        System.out.println();        

    }
}
 }   

//  *****
//   *****
//    *****
//     *****
//      *****
