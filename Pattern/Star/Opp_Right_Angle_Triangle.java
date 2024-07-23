public class Opp_Right_Angle_Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(i>=j)
                System.out.print("*");
                else
                System.out.print(" ");
            }      
        System.out.println();
    }
}
}

//     *
//    **
//   ***
//  ****
// *****