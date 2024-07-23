//package PatternPdf;

public class Pattern32 {
    public static void main(String[] args) {
        
                
        // int end=6;
        // int cnt1=5;	
        // for(int i=1;i<=6;i++)
        // {
        //     int cnt2=cnt1;
        //     for(int j=1;j<=end;j++)
        //     {
        //         System.out.print((char)(cnt2+65));
        //         cnt2--;
        //     }
        //     System.out.println();
        //     end--;
        // }
                
        int end=6;
        char ch='F';
         for(int i=1;i<=6;i++)
        {
           char ch1=ch;
            for(int j=1;j<=end;j++)
            {
                System.out.print(ch1);
               ch1--;
            }
            System.out.println();
            end--;
        }
    }
}


// FEDCBA
// FEDCB
// FEDC
// FED
// FE
// F