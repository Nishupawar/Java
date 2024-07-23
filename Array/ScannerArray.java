import java.util.Scanner;

public class ScannerArray {
 public static void main(String[] args) {
       int [] c=new int[7]; 
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<c.length;i++){
            System.out.println("Enter Element: "+i);
          c[i]=sc.nextInt();
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
}   
}

