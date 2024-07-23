public class A_To_Z {
    public static void main(String[] args) {
        int cnt=0;
        for(int i=1;i<=6;i++)
        {
            int cnt2=cnt;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(cnt2+65));
                cnt2=cnt2+5;
            }
            System.out.println();
            cnt++;
        }
    }
}


// A
// BG
// CHM
// DINS
// EJOTY
// FKPUZ_