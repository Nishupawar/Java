import java.util.Arrays;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int [] a=new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++) {
            System.out.println("Print Elements"+i);
        a[i]=sc.nextInt();
        } //    int [] a= {11,22,33,44,55,66,77};
        int start=0;
        int end=a.length-1;
        while(start<end) {
            int temp= a[start];
            a[start]= a[end];
            a[end] =temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");   
        }
         
    }
}
