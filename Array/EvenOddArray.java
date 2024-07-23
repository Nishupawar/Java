import java.util.Arrays;
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {

        int[] a = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter Element: " + i + " ");
            a[i] = sc.nextInt();
        }
        int evenCnt = 0;
        int oddCnt = 0;
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] % 2 == 0)
                evenCnt++;
            else
                oddCnt++;
        }
        System.out.println("Even Count : " + evenCnt);
        System.out.println("Odd Count : " + oddCnt);

        int[] evenArr = new int[evenCnt];
        int[] oddArr = new int[oddCnt];

        int evenIndex = 0;
        int oddIndex = 0;
        
        for (int i = 0; i < a.length; i++)
         {
            if (a[i] % 2 == 0) {
                evenArr[evenIndex] = a[i];
                evenIndex++;
            } else {
                oddArr[oddIndex] = a[i];
                oddIndex++;
            }

        }

        System.out.println(Arrays.toString(evenArr) + "Even Numbers");
        System.out.println(Arrays.toString(oddArr) + "Odd Numbers ");

    }
}

// System.out.print("Even Numbers:");
// for(int i=0;i<a.length;i++){
// if(a[i]%2==0){
// System.out.print(a[i]);
// }
// }

// System.out.println("Odd Numbers:");
// for(int i=0;i<a.length;i++){
// if(a[i]%2!=0){
// System.out.println(a[i]);