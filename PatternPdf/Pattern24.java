//package PatternPdf;

public class Pattern24 {
    public static void main(String[] args) {
        int end=9;    int mid=5;
        for(int i=1;i<=9;i++)    {
            for(int j=1;j<=mid;j++)  {
            System.out.print(" ");
        }
            for(int j=mid;j<=end;j++)   {
                System.out.print("*");
            }
            if(i<5){
            mid--;
            end--;
            }
            else{
            mid++;
            end++;
            }
            System.out.println();  
    }
}
}


//      *****
//     *****
//    *****
//   *****
//  *****
//   *****
//    *****
//     *****
//      *****