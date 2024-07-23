public class FiveToOne {
    public static void main(String[] args) {
        int cnt1=5;
        int end=5;
            for(int i=1;i<=5;i++)
            {
                int cnt2=cnt1;
                for(int j=1;j<=end;j++)
                {
  System.out.print(cnt2);
  cnt2--;
                }
                end--;
                System.out.println();
                cnt1--;
            }
}
}
// 54321
// 4321
// 321
// 21
// 1

