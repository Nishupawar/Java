//package PatternPdf;

public class Pattern26 {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
               // ch++;
            }
            ch++;
            System.out.println();
        }
    }
}


// A
// BB
// CCC
// DDDD
// EEEEE