//package PatternPdf;

public class Pattern36 {
    public static void main(String[] args) {
        
        int cnt1=0;
        for(int i=1;i<=6;i++)
        { 
            int cnt2=cnt1;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(cnt2+65));
                cnt2--;
            }
            
            System.out.println();
            cnt1++;
        }
    }
}


// A
// BA
// CBA
// DCBA
// EDCBA
// FEDCBA