public class ABCD_P4 {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++)
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