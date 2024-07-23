import java.util.Scanner;

public class NumberPresentInArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int arr[] = new int[5];
       System.out.println("Enter Elements:");
       for(int i=0;i<arr.length;i++)
       {
        arr[i] = sc.nextInt();
       }
       System.out.println("enter no:");
        int num=sc.nextInt();

       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]==num){
        System.out.println("Number is present at index: "+i);
break;
       }
    }
    }
}
