//package PatternPdf;

public class Pattern35 {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=6;i++)
        { 
            //ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            
            System.out.println();
        }
    }
}


// A 
// B C
// D E F
// G H I J
// K L M N O
// P Q R S T U