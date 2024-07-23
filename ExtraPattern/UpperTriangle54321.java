public class UpperTriangle54321 {
    public static void main(String[] args) {
        int cnt = 5;
        int end = 5;
        for (int i = 1; i <= 5; i++) {
            int cnt2 = cnt;
            for (int j = 1; j <= end; j++) {

                System.out.print(cnt2);
                cnt2--;
            }
            System.out.println();
            cnt--;
            end--;
        }}}
// 54321
// 4321
// 321
// 21
// 1