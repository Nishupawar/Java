import java.util.Arrays;
import java.util.Scanner;
public class BasicArraySort {
    public static void main(String[] args) {
        int []a =new int[5];
        System.out.println("Enter Array element");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
   Arrays.sort(a); // for sorting
  

   //enhanced for loop
  System.out.println("Elements are : ");
        for(int b:a){
            System.out.print(b + " ");
        }
    }
}
