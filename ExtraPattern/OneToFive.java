public class OneToFive {
    public static void main(String[] args) {
        int cnt1=1;
            for(int i=1;i<=5;i++)
            {
                int cnt2=cnt1;
                for(int j=1;j<=i;j++)
                {
  System.out.print(cnt2);
  cnt2--;
                }
                System.out.println();
                cnt1++;
           }
}}
// 1
// 21
// 321
// 4321
// 54321